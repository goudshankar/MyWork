package com.spring.dao;

import com.spring.model.User;

public interface UserDao
{
  public boolean save(User paramUser);
  
  public User getUserDetails(String paramString);
}

