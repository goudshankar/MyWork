package com.spring.service;

import com.spring.model.User;

public interface UserService
{
  public boolean registerUser(User paramUser);
  
  public User getUserDetails(String paramString);
}
