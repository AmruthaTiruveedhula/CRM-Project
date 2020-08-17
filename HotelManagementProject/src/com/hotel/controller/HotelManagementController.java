package com.hotel.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.List;
import java.util.logging.SimpleFormatter;

import javax.validation.Valid;

import org.hibernate.jpa.criteria.predicate.IsEmptyPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.entities.BookingDetails;
import com.hotel.entities.Hotel;
import com.hotel.entities.RoomDetails;
import com.hotel.entities.User;
import com.hotel.service.HotelManagementService;

@Controller
public class HotelManagementController {

	@Autowired
	HotelManagementService service;
	
	
	@RequestMapping("/home")
	public String Home(Model model)
	{
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String loginHome(Model model)
	{
		model.addAttribute("msg","Hotel Management System");
		
		return "Login";
	}
	@RequestMapping("/loginSuccess")
	public String loginSuccess(@RequestParam("uid") int uid,@RequestParam("pass")String pass,Model model)
		{
		try{
			
			model.addAttribute("uid", uid);
			model.addAttribute("pass", pass);
			System.out.println(pass);
			
				
		List<User> li=service.loginValidation(uid,pass);
		
		if(!li.isEmpty()){
		model.addAttribute("msg", "Successful Login");
		
		List<Hotel> ho=service.displayHotelDetails();
		model.addAttribute("ho", ho);
		if(!ho.isEmpty() && ho!=null)
		{
		
		model.addAttribute("list",ho);
		return "SuccessLogin";
		}
		
		else
		{
			model.addAttribute("error","No Hotels Available");
			return "ErrorLogin";
		}
		}
		else{
			model.addAttribute("error","Login Failed");
			return "ErrorLogin";
		}
			
			
		}
	catch(Exception e)
	{
		model.addAttribute("error",e.getMessage());
		return "Error";
	}
}
	
	
	@RequestMapping("/viewrooms")
	public String showDisplay(@RequestParam("hid") String hotelId,@RequestParam("uid") int uid,@RequestParam("pass") String pass,Model model){
		List<RoomDetails> rlist=service.viewAllRooms(hotelId);
		if(rlist!=null && !rlist.isEmpty()){
		model.addAttribute("rlist",rlist);
		model.addAttribute("uid", uid);
		model.addAttribute("pass", pass);
		return "RoomDetails";
		}
		else
		{
			model.addAttribute("error","Sorry No Rooms Available");
			model.addAttribute("uid", uid);
			model.addAttribute("pass", pass);
			return "Error";
		}
		}
	
	@RequestMapping("/bookroom")
	public String bookRoom(@RequestParam("hid")String hid,@RequestParam("uid") int uid,@RequestParam("rid")String rid,@RequestParam("pass")String pass,Model model)
	{
		model.addAttribute("hid",hid);
		model.addAttribute("rid",rid);
		model.addAttribute("uid",uid);
		model.addAttribute("pass",pass);
		model.addAttribute("bdetails",new BookingDetails());
		return "bookingDetails";
		
	}
	@RequestMapping("/bookingSuccess")
	
public String insertBooking(@RequestParam("bookedFrom")Date from,@RequestParam("pass")String pass,@RequestParam("bookedTo") Date to,@RequestParam("uid") int uid,@RequestParam("hid")String hid,@RequestParam("rid")String rid,@ModelAttribute("bdetails")BookingDetails bd,Model model){
		LocalDate from1=from.toLocalDate();
		LocalDate to1=to.toLocalDate();
		
		long d=ChronoUnit.DAYS.between(from1,to1);
		if(d>0)
		{
			double amt;
		RoomDetails pnr=service.getperNightRate(hid,rid);
		RoomDetails rtype=service.getRoomType(hid,rid);
		
		
		int adults=bd.getNoOfAdults();
		int child=bd.getNoOfChildren();
		
		
		double amt1=pnr.getPerNightRate()*adults*d;
		double amt2=pnr.getPerNightRate()*child*d;
		amt=amt1+amt2;
		if(rtype.getRoomType().equalsIgnoreCase("ac"))
	    amt=amt+100;
		bd.setAmount(amt);
		bd.setUserId(uid);
		
		
		service.insertBookingDetails(bd);
		int r=service.updateRoomDetails(hid,rid);
		if(r==1){
		model.addAttribute("amt",amt);
		model.addAttribute("bid",bd.getBookingId());
		model.addAttribute("uid", uid);
		model.addAttribute("pass",pass);
        return "successBooking";
		}
		else
		{
			model.addAttribute("error","Sorry...Not booked..please try in a while");
			model.addAttribute("uid", uid);
			model.addAttribute("pass", pass);
			return "Error";
		}
		}
		else
		{
			model.addAttribute("error","Sorry...Enter Proper Dates");
			model.addAttribute("uid", uid);
			model.addAttribute("pass", pass);
			model.addAttribute("hid",hid);
			model.addAttribute("rid",rid);
			return "ErrorBooking";
		}
		}
	@RequestMapping("/Register")
	public String regHome(Model model)
	{
		model.addAttribute("mas","Registration Form");
		model.addAttribute("t",new User());
		return "Registration";
	}
	@RequestMapping("/registeruser")
	public String showmodifyTrainee(@ModelAttribute("t")@Valid User user,
			BindingResult res,Model model){
	
		if(res.hasErrors()){
			return "Registration";
			}
		//model.addAttribute("q",stud.getUserName());
		
		int y=service.registration(user);
		model.addAttribute("q",user.getUserName());
		model.addAttribute("x",y);
		model.addAttribute("uid", user.getUserId());
		model.addAttribute("pass", user.getPassword());
			return "Registersuccess";
		}
		
}
