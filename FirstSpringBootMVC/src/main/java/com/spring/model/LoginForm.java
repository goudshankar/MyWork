package com.spring.model;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm
{
  @NotEmpty
  private String userName;
  @NotEmpty
  @Size(min=6, max=32)
  private String password;
  
  public LoginForm(String username, String password)
  {
    this.userName = username;
    this.password = password;
  }
  
  public LoginForm()
  {
    this.userName = "";
    this.password = "";
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
}
