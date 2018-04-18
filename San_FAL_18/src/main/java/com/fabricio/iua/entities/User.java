package com.fabricio.iua.entities; 

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long userId;
	
	
	@Column(name = "userName", nullable = false, length=50)
	private String userName;
	
	@Column(name = "password", nullable = false, length=50)
	private String password;
	
	@Column(name = "email", nullable = false, length=50)
	private String email;
	
	@Column(name = "name", nullable = false, length=50)
	private String name;
	
	@Column(name = "surname", nullable = false, length=50)
	private String surname;

	@Column(name = "added_date")
	private Date addedDate;

	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public Date getAddedDate() {
		return addedDate;
	}


	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	
	
	
    
}
