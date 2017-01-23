package com.mandal.p2pHire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mandal.p2pHire.logging.IMessage;
import com.mandal.p2pHire.logging.MessageLog;
import com.mandal.p2pHire.service.UserService;

/**
 * This is the main controller 
 *  @author manishm
 *
 */

@Controller
@RequestMapping("/")
@SessionAttributes("roles")
public class AppController {
	
	private static final MessageLog logger = MessageLog.getLoggerInstance();
	private static final String CLASS_NAME = "AppController.";
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		logger.println(IMessage.DEBUG, new StringBuilder(CLASS_NAME).append("login"));
		return "login";
	}

}
