package com.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="users")
public class User {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user_seq")
	@SequenceGenerator(name="user_seq",sequenceName="user_ids",allocationSize=1)
	@Column(name="user_id")
	public int userId;
	
	@NotEmpty(message="Please Enter Your Password")
	@Pattern(regexp = "^[a-zA-Z0-9]{5,20}$", message = "Password may contain  alphabets or numbers of length 5 to 20 ")
	public String password;
	
	public String role;
	
	@NotEmpty(message="Please Enter User Name")
	@Pattern(regexp = "^[A-Za-z ]{3,20}$", message = "Username must contain only alphabets")
	@Column(name="user_name")
	public String userName;
	
	@Size(min=10,max=10,message="Phone Number Should Accept Only 10 digits")
	@Pattern(regexp = "^[0-9]+$", message = "Phone Number should contain only 10 digits")
	@Column(name="mobile_no")
	public String mobile;
	
	
	@NotEmpty(message="Please Enter Address")
	@Pattern(regexp = "^[a-zA-Z0-9,/:-]{4,25}$", message = "Address may contain (numbers alphabets , . : -")
	public String address;
	
	@NotEmpty(message="Please Enter EmailId")
	@Pattern(regexp = "^(.+)@(.+)$", message = "EmailId must follow the pattern")
	public String email;
	
	@Size(min=10,max=10,message="Phone Number Should Accept Only 10 digits")
	@Pattern(regexp = "^[0-9]+$", message = "Phone Number should contain only 10 digits")
	public String phone;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	
}
