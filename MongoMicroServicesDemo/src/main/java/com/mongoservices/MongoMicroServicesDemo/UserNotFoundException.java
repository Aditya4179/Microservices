package com.mongoservices.MongoMicroServicesDemo;

public class UserNotFoundException extends Exception{

	public UserNotFoundException(String msg) {
		super(msg);
	}
}