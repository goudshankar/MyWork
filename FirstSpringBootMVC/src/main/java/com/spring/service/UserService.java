package com.spring.service;

import java.util.List;

import com.spring.dto.UserDetailsDTO;
import com.spring.model.User;
import com.spring.model.User_Roles;

public interface UserService
{
  public boolean registerUser(User paramUser);
  
  public User getUserDetailsByName(String paramString);
  public List<User> getUserDetails();
  public List<User_Roles> getRolesDetails();
  public List<UserDetailsDTO> getUserRolesDetails();
}
