package com.hotel.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hotel.entities.BookingDetails;
import com.hotel.entities.Hotel;
import com.hotel.entities.RoomDetails;
import com.hotel.entities.User;

@Repository
public class HotelManagementImpl implements HotelManagementDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public List<User> loginValidation(int uid, String pass) {
		
		TypedQuery<User> query=em.createQuery("Select u from User u where user_id =:uid and password =:pass", User.class);
		query.setParameter("uid",uid);
		query.setParameter("pass",pass);
		List<User> list=query.getResultList();
		return list;
	}


	@Override
	public List<Hotel> displayHotelDetails() {
		TypedQuery<Hotel> query=em.createQuery("Select u from Hotel u", Hotel.class);
		List<Hotel> list1=query.getResultList();
			return list1;
	}


	@Override
	public List<RoomDetails> viewAllRooms(String hotelId) {
		TypedQuery<RoomDetails> query=em.createQuery("Select u from RoomDetails u where hotel_id=:hid and availability=1",RoomDetails.class);
		query.setParameter("hid",hotelId);
		System.out.println(hotelId);
		List<RoomDetails> list1=query.getResultList();
		for(RoomDetails list:list1)
		System.out.println(list);
			return list1;
	}


	@Override
	public void insertBookingDetails(BookingDetails b) {
	em.persist(b);
		
	}


	@Override
	public RoomDetails getperNightRate(String hid,String rid) {
		
		TypedQuery<RoomDetails> query=(TypedQuery<RoomDetails>)em.createQuery("Select w from RoomDetails w where hotel_id=:hid and room_id=:rid",RoomDetails.class);
		query.setParameter("hid",hid);
		query.setParameter("rid",rid);
		RoomDetails r=query.getSingleResult();
		return r;
	}


	@Override
	public RoomDetails getRoomType(String hid, String rid) {
		TypedQuery<RoomDetails> query=(TypedQuery<RoomDetails>)em.createQuery("Select w from RoomDetails w where hotel_id=:hid and room_id=:rid",RoomDetails.class);
		query.setParameter("hid",hid);
		query.setParameter("rid",rid);
		RoomDetails type=query.getSingleResult();
		return type;
	}


	@Override
	public int updateRoomDetails(String hid, String rid) {
		final int m=em.createQuery("update RoomDetails r set r.availability=0 where hotel_id=:hid and room_id=:rid").setParameter("hid",hid).setParameter("rid",rid).executeUpdate();
		return m;
	}


	@Override
	public int registration(User user) {
		
		
		em.persist(user);
		int r=user.getUserId();
		System.out.println(r);
		return r;
	}

}
