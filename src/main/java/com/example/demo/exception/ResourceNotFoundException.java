package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException{
	private String resourceName;
	private String fieldName;
	private String fielValue;
	public ResourceNotFoundException(String resourceName, String fieldName, String fielValue) {
		super(resourceName+" "+fieldName+" "+fielValue);
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fielValue = fielValue;
	}
}
