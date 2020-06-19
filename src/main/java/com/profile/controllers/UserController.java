package com.profile.controllers;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.profile.exception.UserNotFoundException;
import com.profile.rs.model.UserDTO;
import com.profile.services.IUserService;

@RestController
public class UserController {
    
	@Inject
	private IUserService userService;
	
	@PostMapping("user/create")
	public ResponseEntity<Object> createUser(@RequestBody UserDTO user){
		try {
			userService.createUser(user);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception exception) {
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("user")
	public ResponseEntity<UserDTO> getUserDeails(@RequestParam("id") int id){
		try {
			return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
		}catch(UserNotFoundException userNotFoundException) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}catch(Exception exception) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
