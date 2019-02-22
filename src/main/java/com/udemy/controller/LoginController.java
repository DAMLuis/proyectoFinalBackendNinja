package com.udemy.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemy.constant.ViewConstant;


@Controller
public class LoginController {
	
	private static final Log LOG = LogFactory.getLog(LoginController.class);

	/*@GetMapping("/")
	public String redirectToLogin() {
		LOG.info("METODO: redirectTologin");
		return "redirect:/login";
	}*/
	
	
	
	@GetMapping("/login")
	public String showLoginForm(Model model , 
			@RequestParam(name="error" , required=false) String error ,
			@RequestParam(name="logout" , required=false) String logout )  {
		LOG.info("METODO: showLoginForm -- PARAMS: error=" + error + " logout= " + logout  );
	//model.addAttribute("userCredentials",new UserCredential() );
		model.addAttribute("error",error);
		model.addAttribute("logout",logout);
		
		LOG.info("RETURN login view");
		return ViewConstant.LOGIN;
	}
	
	@GetMapping({"/loginsuccess","/"})
	public String loginCheck() {
		LOG.info("METODO: loginCheck");

		return "redirect:/contacts/showcontacts";
	
	}
	
}
