package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.spring.model.User;
import com.spring.model.User_Roles;

@Repository
public class UserDaoImplJDBCTemplate
  implements UserDao
{
	private static final String INSERT_QUERY = "insert into user values(?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_QUERY = "select * from user where username=?";
	private static final String GET_USERS="SELECT username,email,mobile FROM USER";
	private static final String GET_ROLES="select * from user_roles";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public boolean save(User userForm) {
		boolean returnObject = false;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Object[] args = new Object[] { userForm.getUserName(), userForm.getPassword(), userForm.getConfirmPassword(),
				userForm.getEmail(), userForm.getMobile(), userForm.getGender(), userForm.getDob(),
				userForm.getSkills() };

		int out = jdbcTemplate.update(INSERT_QUERY, args);

		if (out != 0) {
			System.out.println("User saved with id=" + userForm.getUserId());
		} else
			System.out.println("User save failed with id=" + userForm.getUserId());
		return returnObject;
	}

	@Override
	public User getUserDetailsByName(String userName) {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		// using RowMapper anonymous class, we can create a separate RowMapper for reuse

		User usr = jdbcTemplate.queryForObject(SELECT_QUERY, new Object[] { userName }, new RowMapper<User>() {
			
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setUserName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setConfirmPassword(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setMobile(rs.getString(6));
				user.setGender(rs.getString(7));
				//user.setDate(8, (java.sql.Date)rs.getDob());
				//user.setDob((java.sql.Date)rs.getDate(8));
				//usr.setSkills((((User) rs).getSkills()));
				return user;
			}
		});
		return usr;
	}

	@Override
	public List<User_Roles> getRolesDetails() {
		// TODO Auto-generated method stub
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<User_Roles> role=jdbcTemplate.query(GET_ROLES, new RowMapper<User_Roles>() {
		@Override
			public User_Roles mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				User_Roles userRoles=new User_Roles();
				userRoles.setUser_role_id(rs.getInt(1));
				userRoles.setUsername(rs.getString(2));
				userRoles.setRole(rs.getString(3));
				  
				return userRoles;
			}
			
		} );
		return role;
	}

	@Override
	public List<User> getUserDetails() {
		// TODO Auto-generated method stub
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<User> user=jdbcTemplate.query(GET_USERS, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				User users=new User();
				users.setUserName(rs.getString(1));
				users.setEmail(rs.getString(2));
				users.setMobile(rs.getString(3));
				  
				return users;
			}
			
		} );
		return user;
		
	}
}