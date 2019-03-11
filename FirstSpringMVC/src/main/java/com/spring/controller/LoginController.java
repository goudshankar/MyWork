package com.spring.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dto.UserDetailsDTO;
import com.spring.model.LoginForm;
import com.spring.model.User;
import com.spring.service.UserService;
/*
 * In LoginController we have taken Login(-),
 * 
 * */


@Controller 
public class LoginController {
	private static final Logger logger = Logger.getLogger(LoginController.class);

	@Autowired
	private UserService userService;
	
	//propertyEditors
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	//Login page
	@RequestMapping(value = { "/login" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String login(Model model, HttpServletRequest request, HttpServletResponse response) {
		if (request.getParameter("err") != null) {
			model.addAttribute("message", System.getProperty("message"));
		}
		
		model.addAttribute("loginForm", new LoginForm());

		return "loginpage";
	}
	
	//welcome page
	@RequestMapping(value = { "/", "/welcome**" }, method = {
			org.springframework.web.bind.annotation.RequestMethod.GET })
	public String loggedIn(Model model, @Valid @ModelAttribute("loginForm") LoginForm loginForm, BindingResult result,
			HttpServletRequest request) {
		String userName = getPrincipal();
		User user = this.userService.getUserDetailsByName(userName);
		model.addAttribute("userDetails", user);

		return "welcome";
	}
	//admin page
	@RequestMapping(value = { "/admin" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String adminPage(ModelMap model) {
		String userName = getPrincipal();
		System.out.println("userName of adminPage method:" + userName);
		List<UserDetailsDTO> userDetailsDTO = this.userService.getUserRolesDetails();
		model.addAttribute("listdto", userDetailsDTO);
		model.addAttribute("user", getPrincipal());
		return "admin";
	}
	//Logout page
	@RequestMapping(value = { "/logout" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}

		return "redirect:/login";
	}
	//Access Denied page
	@RequestMapping(value = { "/accessDenied" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String accessDeniedPage(ModelMap model) {
		model.addAttribute("user", getPrincipal());

		return "accessDenied";
	}

	private String getPrincipal() {
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if ((principal instanceof UserDetails)) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}

		return userName;
	}
	//Exception Handling
	@ExceptionHandler(org.apache.commons.dbcp.SQLNestedException.class)
	public ModelAndView handleUserNotFoundException(HttpServletRequest request, Exception exception) {

		logger.error("Requested Url:" + request.getRequestURI());
		logger.error("Exception Raised:" + exception);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exception", exception);
		modelAndView.addObject("url", request.getRequestURI());
		modelAndView.setViewName("loginpage");
		return modelAndView;
	}
}
