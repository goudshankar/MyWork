package com.spring.dao;

import com.spring.model.SkillsVo;
import com.spring.model.User;
import com.spring.model.User_Roles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl
  implements UserDao
{
  @Autowired
  DataSource dataSource;
  @Autowired
  ApplicationContext applicationContext;
  
  public boolean save(User userForm)
  {
    String query = "insert into user values(?,?,?,?,?,?,?,?,?)";
    PreparedStatement ps = null;
    boolean returnObject = false;
    try
    {
      Connection connection = this.dataSource.getConnection();
      ps = connection.prepareStatement(query);
      ps.setInt(1, userForm.getUserId());
      ps.setString(2, userForm.getUserName());
      ps.setString(3, userForm.getPassword());
      ps.setString(4, userForm.getConfirmPassword());
      ps.setString(5, userForm.getEmail());
      ps.setString(6, userForm.getMobile());
      ps.setString(7, userForm.getGender());
      ps.setDate(8, (java.sql.Date)userForm.getDob());
      ps.setString(9, userForm.getSkills().getName());
      returnObject = ps.execute();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return returnObject;
  }
  
  public User getUserDetailsByName(String userName)
  {
    String query = "select * from user where username=?";
    PreparedStatement ps = null;
    User user = (User)this.applicationContext.getBean("user");
    try
    {
      Connection connection = this.dataSource.getConnection();
      ps = connection.prepareStatement(query);
      ps.setString(1, userName);
      ResultSet rs = ps.executeQuery();
      while (rs.next())
      {
        user.setUserName(rs.getString(2));
        user.setEmail(rs.getString(5));
        user.setMobile(rs.getString(6));
        user.setGender(rs.getString(7));
        java.util.Date dob = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString(8));
        user.setDob(dob);
        
        SkillsVo skillvo = new SkillsVo();
        skillvo.setName(rs.getString(9));
        user.setSkills(skillvo);
      }
    }
    catch (SQLException|ParseException e)
    {
      e.printStackTrace();
    }
    return user;
  }

@Override
public List<User_Roles> getRolesDetails() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<User> getUserDetails() {
	// TODO Auto-generated method stub
	return null;
}

}