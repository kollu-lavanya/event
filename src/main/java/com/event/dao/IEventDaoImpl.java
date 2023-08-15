package com.event.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.event.exception.EventNotFoundException;
import com.event.model.Event;
import com.event.util.DbConnection;
import com.event.util.Queries;

public class IEventDaoImpl implements IEventDao {

	@Override
	public void addEvent(Event event) {
		// TODO Auto-generated method stub
		try(Connection connection = DbConnection.openConnection();
		PreparedStatement preparedStatement= connection.prepareStatement(Queries.INSERTQUERY)){
			preparedStatement.setString(1,event.getSingername() );
			preparedStatement.setString(2, event.getPlace());
			preparedStatement.setInt(3, event.getExperiance());
			preparedStatement.setDouble(4,event.getTicketprice() );
			preparedStatement.setString(5,event.getLanguage());
			preparedStatement.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Event> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEvent(int singerId, double ticketprice) {
		// TODO Auto-generated method stub
		
		try (
				Connection connection = DbConnection.openConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY)){
			preparedStatement.setDouble(1, ticketprice);
			preparedStatement.setInt(2,singerId);
			preparedStatement.execute();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		return 0;
	}

	@Override
	public void deleteEvent(int singerId) {
		// TODO Auto-generated method stub
		try(Connection connection= DbConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEBYID)){
			preparedStatement.setInt(1,singerId);
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
//	public Event findById(int singerId) throws EventNotFoundException{
//		// TODO Auto-generated method stub
//		List<Event> list = new ArrayList<>();
//		// TODO Auto-generated method stub
//		
//		try 
//		(Connection connection = DbConnection.openConnection();
//				
//				PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYID);) {
//			preparedStatement.setInt(1, singerId);
//			ResultSet rt = preparedStatement.executeQuery();{
//				while (rt.next()) {
//
//					String place = rt.getString("place");
//					String singername = rt.getString("singername");
//					Integer experience = rt.getInt("experiance");
//					String language=rt.getString("language");
//					Double ticketprice = rt.getDouble("ticketprice");
//					Event event=new Event(place,singername,ticketprice,language,experience);
//					System.out.println(event.toString());
//					list.add(event);
//					
//				}
//			}
//			return list;			
//	
//	}catch(SQLException e) {
//		e.printStackTrace();
//	}
//	
//	
//	return null;
//	}
	public List<Event> findById(int singerId) throws EventNotFoundException {
	    List<Event> eventt = new ArrayList<>();
	    try {
	        Connection connection = DbConnection.openConnection();
	        PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYID);
	        statement.setInt(1, singerId);
	        ResultSet rt = statement.executeQuery();

	        while (rt.next()) {
	            String place = rt.getString("place");
	            String singername = rt.getString("singername");
	            Integer experience = rt.getInt("experiance");
	            String language = rt.getString("language");
	            Double ticketprice = rt.getDouble("ticketprice");
	            Event event1 = new Event(place, singername, ticketprice, language, experience);
	            eventt.add(event1);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return eventt;
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
