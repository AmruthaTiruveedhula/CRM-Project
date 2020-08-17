package com.hotel.dao;

import java.util.List;

import com.hotel.entities.BookingDetails;
import com.hotel.entities.Hotel;
import com.hotel.entities.RoomDetails;
import com.hotel.entities.User;

public interface HotelManagementDao {

	public List<User> loginValidation(int uid, String pass);

	public List<Hotel> displayHotelDetails();

	public List<RoomDetails> viewAllRooms(String hotelId);

	public void insertBookingDetails(BookingDetails b);

	public RoomDetails getperNightRate(String hid,String rid);

	public RoomDetails getRoomType(String hid, String rid);

	public int updateRoomDetails(String hid, String rid);

	public int registration(User user);

}
