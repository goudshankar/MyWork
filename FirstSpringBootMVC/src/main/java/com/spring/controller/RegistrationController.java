package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.SkillsVo;
import com.spring.model.User;
import com.spring.propertyeditor.SkillsEditor;
import com.spring.service.UserService;

@Controller
public class RegistrationController
{
  @Autowired
  private UserService userService;
  @Autowired
  User user;
  private String SKILL_SET = "skillSet";
  private Validator validator;
  
  public RegistrationController()
  {
    ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    this.validator = validatorFactory.getValidator();
  }
  
  @InitBinder
  public void initBinder(WebDataBinder binder)
  {
    binder.registerCustomEditor(SkillsVo.class, new SkillsEditor());
  }
  
  @ModelAttribute("skills")
  public List<SkillsVo> populateSkills()
  {
    List<SkillsVo> skills = new ArrayList();
    skills.add(new SkillsVo(Integer.valueOf(-1), "Select"));
    skills.add(new SkillsVo(Integer.valueOf(1), "Java"));
    skills.add(new SkillsVo(Integer.valueOf(2), "C"));
    skills.add(new SkillsVo(Integer.valueOf(3), ".Net"));
    skills.add(new SkillsVo(Integer.valueOf(4), "SAP"));
    return skills;
  }
  
  @RequestMapping(value={"/registration"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public ModelAndView registration(Model model)
  {
    model.addAttribute("userForm", this.user);
    
    return new ModelAndView("registration", "test", model);
  }
  
  @RequestMapping(value={"/register"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public ModelAndView register(Model model, @Valid @ModelAttribute("userForm") User userForm, BindingResult result)
  {
    if (result.hasErrors())
    {
      model.addAttribute("userForm", userForm);
      return new ModelAndView("registration", "test", model);
    }
    boolean value = this.userService.registerUser(userForm);
    String returnObject;
    if (!value) {
      returnObject = "registrationSuccess";
    } else {
      returnObject = "error";
    }
    return new ModelAndView("returnObject", "test", model);
  }
}