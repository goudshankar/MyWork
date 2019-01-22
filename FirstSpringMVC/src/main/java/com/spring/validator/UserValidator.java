package com.spring.validator;

import com.spring.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component("userValidator")
public class UserValidator
  implements Validator
{
  public boolean supports(Class<?> clazz)
  {
    return clazz.isAssignableFrom(User.class);
  }
  
  public void validate(Object target, Errors errors)
  {
    User cmd = null;
    
    cmd = cmd;
    if ((cmd.getUserName() == null) || (cmd.getUserName().equals("")) || (cmd.getUserName().length() == 0)) {
      errors.rejectValue("uname", "uname.required");
    }
    if ((cmd.getPassword() == null) || (cmd.getPassword().equals("")) || (cmd.getPassword().length() == 0)) {
      errors.rejectValue("pwd", "pwd.required");
    }
  }
}
