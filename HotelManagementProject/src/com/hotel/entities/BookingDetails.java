package com.hotel.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="bookingdetails")
public class BookingDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="book_seq")
	@SequenceGenerator(name="book_seq",sequenceName="bid_id",allocationSize=1)
	@Column(name="booking_id")
	private int bookingId;
	@Column(name="room_id")
	private String roomId;
	@Column(name="user_id")
	private int userId;
	@Column(name="booked_from")
	@DateTimeFormat( iso =ISO.DATE)
	private Date bookedFrom;
	@Column(name="booked_to")
	@DateTimeFormat( iso =ISO.DATE)
	private Date bookedTo;
	@Column(name="no_of_adults")
	private Integer noOfAdults;
	@Column(name="no_of_children")
	private Integer noOfChildren;
	@Column(name="amount")
	private Double amount;
	@Column(name="hotel_id")
	private String hotelId;
	public BookingDetails() {
		super();
	}
	
	
	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public Date getBookedFrom() {
		return bookedFrom;
	}
	public void setBookedFrom(Date bookedFrom) {
		this.bookedFrom = bookedFrom;
	}
	public Date getBookedTo() {
		return bookedTo;
	}
	public void setBookedTo(Date bookedTo) {
		this.bookedTo = bookedTo;
	}
	public Integer getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(Integer noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public Integer getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(Integer noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	
}
