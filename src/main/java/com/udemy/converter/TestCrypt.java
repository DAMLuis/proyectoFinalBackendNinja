package com.udemy.converter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestCrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder pEncoder = new BCryptPasswordEncoder();
		System.out.println(pEncoder.encode("user"));
	}

}
