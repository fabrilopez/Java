package com.fabricio.iua.form;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm {
	@NotEmpty
	@Size(min = 1, max = 50)
	private String userName;
	@NotEmpty
	@Size(min = 1, max = 50)
	private String password;

	private String email;
	
	private String surname;
	
	private String name;
	
	private String generalErrors;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public String getGeneralErrors() {
		return generalErrors;
	}
	public void setGeneralErrors(String generalErrors) {
		this.generalErrors = generalErrors;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
