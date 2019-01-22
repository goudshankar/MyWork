package com.spring.dao;

import com.spring.model.User;
import java.io.PrintStream;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImplJDBCTemplate
  implements UserDao
{
  public boolean save(User userForm)
  {
    System.out.println("Save");
    return false;
  }
  
  public User getUserDetails(String userName)
  {
    System.out.println("getUserDetails");
    return null;
  }
}
