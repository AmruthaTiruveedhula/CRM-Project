package com.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="roomdetails")
public class RoomDetails {
	
	
	@Column(name="hotel_id")
	private String hotelId;
	
	@Id
	@Column(name="room_id")
	private String roomId;
	@Column(name="room_no")
	private String roomNo;
	@Column(name="room_type")
	private String roomType;
	@Column(name="per_night_rate")
	private double perNightRate;
	@Column(name="availability")
	private Integer availability;
	public RoomDetails() {
		super();
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getPerNightRate() {
		return perNightRate;
	}
	public void setPerNightRate(double perNightRate) {
		this.perNightRate = perNightRate;
	}
	public Integer getAvailability() {
		return availability;
	}
	public void setAvailability(Integer availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "RoomDetails [hotelId=" + hotelId + ", roomId=" + roomId
				+ ", roomNo=" + roomNo + ", roomType=" + roomType
				+ ", perNightRate=" + perNightRate + ", availability="
				+ availability + "]";
	}
	
	
	
}
