package com.yunefara.entities;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yunefara.controller.BaseEntity;

@Entity
public class User extends BaseEntity {

	private String firstName;
	private String lastName;
	private String email;
	@JsonIgnore
	private String password;
	private UserType type = UserType.REGULAR;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

}
