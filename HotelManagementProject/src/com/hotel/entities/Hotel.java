package com.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	@Id
	@Column(name="hotel_id")
	public String hotelId;
	public String city;
	@Column(name="hotel_name")
	public String hotelName;
	public String address;
	public String description;
	@Column(name="avg_rate_pernight")
	public double avgRatePerNight;
	@Column(name="phone_no1")
	public String phone1;
	@Column(name="phone_no2")
	public String phone2;
	public String rating;
	public String email;
	public String fax;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAvgRatePerNight() {
		return avgRatePerNight;
	}
	public void setAvgRatePerNight(double avgRatePerNight) {
		this.avgRatePerNight = avgRatePerNight;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	
	
}
