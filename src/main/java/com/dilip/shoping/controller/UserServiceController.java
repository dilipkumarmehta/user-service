package com.dilip.shoping.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dilip.shoping.beans.User;

@RestController
public class UserServiceController {

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public User login(@RequestBody User user) {
		return null;

	}

	@RequestMapping(value = "/logout/{userId}", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public User logOut() {
		return null;

	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public User signUp(@RequestBody User user) {
		return null;

	}
	
	//@RequestMapping(value="/pow", method=RequestMethod.GET)
	//(@RequestParam(value="base") int base1
	
	//@RequestMapping("/sqrt/{num}")
	//public double sqrt(@PathVariable(value="num") int num1)
}
