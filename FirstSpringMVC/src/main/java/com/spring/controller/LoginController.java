package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.LoginForm;
import com.spring.model.User;
import com.spring.service.UserService;

@Controller
public class LoginController
{
  private static final Logger logger = Logger.getLogger(LoginController.class);
  
  @Autowired
  private UserService userService;
  
  @Bean
  public static NoOpPasswordEncoder passwordEncoder()
  {
    return (NoOpPasswordEncoder)NoOpPasswordEncoder.getInstance();
  }
  
  @RequestMapping(value={"/login"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public String login(Model model)
  {
    if (logger.isDebugEnabled()) {
      logger.debug("getWelcome is executed!");
    }
    model.addAttribute("loginForm", new LoginForm());
    if (logger.isInfoEnabled()) {
      logger.info("Returning loginpage.jsp page");
    }
    return "loginpage";
  }
  
  @RequestMapping(value={"/", "/welcome**"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public String loggedIn(Model model, @Valid @ModelAttribute("loginForm") LoginForm loginForm, BindingResult result, HttpServletRequest request)
  {
    String userName = getPrincipal();
    User user = this.userService.getUserDetails(userName);
    model.addAttribute("userDetails", user);
    if (logger.isInfoEnabled()) {
      logger.info("Returning welcome.jsp page");
    }
    return "welcome";
  }
  
  @RequestMapping(value={"/admin"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public String adminPage(ModelMap model)
  {
    model.addAttribute("user", getPrincipal());
    if (logger.isInfoEnabled()) {
      logger.info("Returning admin.jsp page");
    }
    return "admin";
  }
  
  @RequestMapping(value={"/logout"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public String logoutPage(HttpServletRequest request, HttpServletResponse response)
  {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    if (auth != null) {
      new SecurityContextLogoutHandler().logout(request, response, auth);
    }
    if (logger.isInfoEnabled()) {
      logger.info("Returning login.jsp page");
    }
    return "redirect:/login";
  }
  
  @RequestMapping(value={"/accessDenied"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public String accessDeniedPage(ModelMap model)
  {
    model.addAttribute("user", getPrincipal());
    if (logger.isInfoEnabled()) {
      logger.info("Returning accessDenied.jsp page");
    }
    return "accessDenied";
  }
  
  private String getPrincipal()
  {
    String userName = null;
    Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    if ((principal instanceof UserDetails)) {
      userName = ((UserDetails)principal).getUsername();
    } else {
      userName = principal.toString();
    }
    if (logger.isInfoEnabled()) {
      logger.info("Returning userName");
    }
    return userName;
  }
}
