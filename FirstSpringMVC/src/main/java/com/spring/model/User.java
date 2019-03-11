package com.spring.model;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User 
  implements Serializable
{
  private static final long serialVersionUID = 2808627285393582721L;
  private int userId;
  @Size(min=2, max=30)
  private String userName;
  @NotEmpty
  @Size(min=6, max=32)
  private String password;
  @NotEmpty
  @Size(min=6, max=32)
  private String confirmPassword;
  @NotEmpty
  @Email
  private String email;
  @NotEmpty
  private String mobile;
  @NotNull
  private String gender;
  @NotNull
  @DateTimeFormat
  @Past
  private Date dob;
  @NotNull
  private SkillsVo skills;
  
  public int getUserId()
  {
    return this.userId;
  }
  
  public void setUserId(int userId)
  {
    this.userId = userId;
  }
  
  public String getUserName()
  {
    return this.userName;
  }
  
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
  
  public String getConfirmPassword()
  {
    return this.confirmPassword;
  }
  
  public void setConfirmPassword(String confirmPassword)
  {
    this.confirmPassword = confirmPassword;
  }
  
  public String getEmail()
  {
    return this.email;
  }
  
  public void setEmail(String email)
  {
    this.email = email;
  }
  
  public String getMobile()
  {
    return this.mobile;
  }
  
  public void setMobile(String mobile)
  {
    this.mobile = mobile;
  }
  
  public String getGender()
  {
    return this.gender;
  }
  
  public void setGender(String gender)
  {
    this.gender = gender;
  }
  
  public Date getDob()
  {
    return this.dob;
  }
  
  public void setDob(Date dob)
  {
    this.dob = dob;
  }
  
  public SkillsVo getSkills()
  {
    return this.skills;
  }
  
  public void setSkills(SkillsVo skills)
  {
    this.skills = skills;
  }
}
