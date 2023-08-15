package com.event.dao;

import java.util.List;

import com.event.exception.EventNotFoundException;
import com.event.model.Event;

public interface IEventDao {
	void addEvent(Event event);

	List<	Event> findAll();

	int updateEvent(int singerId, double ticketprice);

	void deleteEvent(int singerId);

	List<Event> findById(int singerId) throws EventNotFoundException;

	List<Event> findBylanguage(String language) throws EventNotFoundException;

	List<Event> findBylanguageAndExperience(String language, int experience) throws EventNotFoundException;

	List<Event> findBySingernameAndticketprice(String singername, double ticketprice) throws EventNotFoundException;
    List<Event> findBySingernameAndplace(String singername,String place) throws EventNotFoundException;

}


