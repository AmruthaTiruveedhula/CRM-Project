package com.hotel.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dao.HotelManagementDao;
import com.hotel.entities.BookingDetails;
import com.hotel.entities.Hotel;
import com.hotel.entities.RoomDetails;
import com.hotel.entities.User;

@Service
@Transactional
public class HotelManagementServiceImpl implements HotelManagementService {

	@Autowired
	HotelManagementDao dao;
	
	
	@Override
	public List<User> loginValidation(int uid, String pass) {
		return dao.loginValidation(uid,pass);
	}


	@Override
	public List<Hotel> displayHotelDetails() {
		return dao.displayHotelDetails();
	}


	@Override
	public List<RoomDetails> viewAllRooms(String hotelId) {
		return dao.viewAllRooms(hotelId);
	}


	@Override
	public void insertBookingDetails(BookingDetails b) {
		
		 dao.insertBookingDetails(b);
	}


	@Override
	public RoomDetails getperNightRate(String hid,String rid) {
		return dao.getperNightRate(hid,rid);
		
	}


	@Override
	public RoomDetails getRoomType(String hid, String rid) {
		// TODO Auto-generated method stub
		return dao.getRoomType(hid,rid);
	}


	@Override
	public int updateRoomDetails(String hid, String rid) {

		return dao.updateRoomDetails(hid,rid);
		
	}


	@Override
	public int registration(User user) {
		return dao.registration(user);
	}



}
