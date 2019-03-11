package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.dto.UserDetailsDTO;
import com.spring.model.User;
import com.spring.model.User_Roles;

@Service
@PropertySource(value = { "classpath:application.properties" })
public class UserServiceImpl implements UserService {
	// @Autowired
	@Resource(name = "${dao.UserDao}")
	private UserDao userDao;
	@Autowired
	ApplicationContext applicationContext;

	@Override
	public boolean registerUser(User userForm) {
		return this.userDao.save(userForm);

	}

	@Override
	public User getUserDetailsByName(String userName) {
		return this.userDao.getUserDetailsByName(userName);
	}

	@Override
	public List<User_Roles> getRolesDetails() {

		return userDao.getRolesDetails();
	}

	@Override
	public List<User> getUserDetails() {
		// TODO Auto-generated method stub
		return userDao.getUserDetails();
	}

	@Override
	public List<UserDetailsDTO> getUserRolesDetails() {
		List<User> uDetails = getUserDetails();
		List<User_Roles> userRoles = getRolesDetails();
		List<UserDetailsDTO> listdto = new ArrayList<UserDetailsDTO>();
		for (User usrDetails : uDetails) {
			String uName = usrDetails.getUserName();
			for (User_Roles uRoles : userRoles) {
				if (uName.equalsIgnoreCase(uRoles.getUsername())) {
					UserDetailsDTO userDetailsDTO=new UserDetailsDTO();	
					userDetailsDTO.setUserName(usrDetails.getUserName());
					userDetailsDTO.setEmail(usrDetails.getEmail());
					userDetailsDTO.setMobile(usrDetails.getMobile());
					userDetailsDTO.setRole(uRoles.getRole());
					listdto.add(userDetailsDTO);
				} // if
			} // inner for
		} // outer for loop
		return listdto;
	}
}