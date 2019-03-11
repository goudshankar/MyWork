package com.spring.dao;

import java.util.List;

import com.spring.model.User;
import com.spring.model.User_Roles;

public interface UserDao
{
  public boolean save(User paramUser);
  
  public User getUserDetailsByName(String paramString);
  
  public List<User> getUserDetails();
  
  public List<User_Roles> getRolesDetails();
}