package com.event.service;

import java.util.List;

import com.event.dao.IEventDao;
import com.event.dao.IEventDaoImpl;
import com.event.exception.EventNotFoundException;
import com.event.model.Event;

public class IEventServiceImpl implements IEventService{
     IEventDao eventDao = new IEventDaoImpl();
	@Override
	public void addEvent(Event event) {
		// TODO Auto-generated method stub
		eventDao.addEvent(event);
		
	}

	@Override
	public List<Event> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEvent(int singerId, double ticketprice) {
		// TODO Auto-generated method stub
		
		return eventDao.updateEvent(singerId, ticketprice);
	}

	@Override
	public void deleteEvent(int singerId) {
		// TODO Auto-generated method stub
		eventDao.deleteEvent(singerId);
		
	}

	@Override
	public List<Event> findById(int singerId) throws EventNotFoundException {
		// TODO Auto-generated method stub
		return eventDao.findById(singerId);
	}

	@Override
	public List<Event> findBylanguage(String language) throws EventNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> findBylanguageAndExperience(String language, int experience) throws EventNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> findBySingernameAndticketprice(String singername, double ticketprice)
			throws EventNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> findBySingernameAndplace(String singername, String place) throws EventNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
