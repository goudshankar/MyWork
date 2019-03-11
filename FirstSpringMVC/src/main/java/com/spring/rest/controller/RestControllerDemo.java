package com.spring.rest.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.spring.service.UserService;

import net.sf.json.JSONObject;

@RestController
public class RestControllerDemo {
	@Autowired
	private UserService userService;
	//@CrossOrigin(origins = "*")
	@RequestMapping(value = "/rest/api/admin/updaterole", method = RequestMethod.POST)
	public JSONObject getData(@RequestBody JSONObject input)
			throws IOException, ClassNotFoundException, SQLException, ParseException {
		System.out.println("input--->" + input);
		/*
		 * String name=input.getString("userName"); String
		 * email=input.getString("email"); String mobile=input.getString("mobile");
		 * String userRole=input.getString("userRole"); JSONObject json =
		 * JSONObject.fromObject(userService.getRolesDetails());
		 */
		return input;
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList("*"));
		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS", "DELETE", "PUT", "PATCH"));
		configuration.setAllowedHeaders(
				Arrays.asList("X-Requested-With", "Origin", "Content-Type", "Accept", "Authorization"));
		configuration.setAllowCredentials(false);
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}

}