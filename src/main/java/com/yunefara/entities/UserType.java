package com.yunefara.entities;

public enum UserType {

	ADMIN("Administrator"), REGULAR("Standard"), SYSTEM("System");

	private final String label;
	
	private UserType(String label) {
		this.label= label;
	}
	
	public String getLabel() {
		return label;
	}
}
