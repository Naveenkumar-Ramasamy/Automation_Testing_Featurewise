package com.omrbranch.pagemanager;

import com.omrbranch.pages.BookHotelPage;
import com.omrbranch.pages.BookingConfrimPage;
import com.omrbranch.pages.ExploreHotelPage;
import com.omrbranch.pages.LoginPage;
import com.omrbranch.pages.MyBookingPage;
import com.omrbranch.pages.SelectHotelPage;

public class PageObjectManager {
	private LoginPage loginPage;
	private ExploreHotelPage exploreHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfrimPage bookingConfrimPage;
	private MyBookingPage bookingPage; 
	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage=new LoginPage():loginPage; 
	}
	public ExploreHotelPage getExploreHotelPage() {
		return (exploreHotelPage==null)?exploreHotelPage=new ExploreHotelPage():exploreHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage=new SelectHotelPage():selectHotelPage;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage=new BookHotelPage():bookHotelPage;
	}
	public BookingConfrimPage getBookingConfrimPage() {
		return (bookingConfrimPage==null)?bookingConfrimPage=new BookingConfrimPage():bookingConfrimPage;
	}
	public MyBookingPage getBookingPage() {
		return (bookingPage==null)?bookingPage=new MyBookingPage():bookingPage;
	}
	
	
	
	
}
