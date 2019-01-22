package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.model.User;
import java.io.PrintStream;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource({"classpath:application.properties"})
public class UserServiceImpl
  implements UserService
{
  @Autowired
  @Resource(name="${dao.UserDao}")
  private UserDao userDao;
  @Autowired
  ApplicationContext applicationContext;
  
  public boolean registerUser(User userForm)
  {
    return this.userDao.save(userForm);
  }
  
  public User getUserDetails(String userName)
  {
    System.out.println(this.userDao.getUserDetails(userName));
    
    return this.userDao.getUserDetails(userName);
  }
}
