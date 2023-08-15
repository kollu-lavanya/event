package com.event.model;

public class Event {
	private String place;
	private String Singername;
	private double ticketprice;
	private String language;
	private int singerId;
	private int experiance;
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Event(String place, String singername, double ticketprice, String language, int experiance) {
		super();
		this.place = place;
		Singername = singername;
		this.ticketprice = ticketprice;
		this.language = language;
		
		this.experiance = experiance;
	}

	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getSingername() {
		return Singername;
	}
	public void setSingername(String singername) {
		Singername = singername;
	}
	public double getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getSingerId() {
		return singerId;
	}
	public void setSingerId(int singerId) {
		this.singerId = singerId;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	@Override
	public String toString() {
		return "EventModel [place=" + place + ", Singername=" + Singername + ", ticketprice=" + ticketprice
				+ ", language=" + language + ", singerId=" + singerId + ", experiance=" + experiance + "]";
	}
	
	
	

}
