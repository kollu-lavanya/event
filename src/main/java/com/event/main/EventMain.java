package com.event.main;

import java.util.List;
import java.util.Scanner;

import com.event.exception.EventNotFoundException;
import com.event.model.Event;
import com.event.service.IEventService;
import com.event.service.IEventServiceImpl;

public class EventMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Event event= new Event("hyderabad","geetha madhuri",1234.34,"telugu", 20);
//		IEventService eventService=new IEventServiceImpl();
//		eventService.addEvent(event);
//		eventService.updateEvent(1,234.45);
//		eventService.deleteEvent(2);
//		eventService.deleteEvent(3);
		Scanner scanner = new Scanner(System.in);
		IEventService eventService = new IEventServiceImpl();
		System.out.println("Welcome to Event App! Please choose the below operations to perform: ");
		System.out.println(
				"1. Add event\n 2. Update event\n 3. find event by By singerID's \n  4. Delete event By Id\n 5. Get event By language\n 7. Get event By language And By Experience\n 8. Get Doctor By Specialist And By Fees");
		int choice = scanner.nextInt();
		if (choice == 1) {
			scanner.nextLine();
			System.out.println("Enter : place ");
			String place = scanner.nextLine();
			System.out.println("Enter singername: ");
			String singername = scanner.nextLine();
			System.out.println("Enter ticketprice: ");
			
			Double ticketprice = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter language: ");
			String language = scanner.nextLine();
			System.out.println("enter experiance");
			Integer experiance = scanner.nextInt();
			Event event= new Event(place,singername,ticketprice,language, experiance);
			eventService.addEvent(event);
	
	}
		else if (choice==2) {
			System.out.println("Enter singerId to update event");
			int singerId = scanner.nextInt();
			System.out.println("Enter  ticket price to update");
			Double ticketprice = scanner.nextDouble();
			Event event= new Event( null, null, ticketprice, null, singerId);
			eventService.updateEvent(singerId, ticketprice);
//			Event event= new Event( ticketprice);
//			eventService.updateEvent(event);
//			eventService.updateEvent(new Event());
		}
		
		
		else if (choice==3) {
//			System.out.println("Enter singer Id to fetch details");
//			int singerId = scanner.nextInt();
//            
//			try {
//				List<Event>events = eventService.findById(singerId);
//			} catch (EventNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("Enter singer Id to fetch details");
		    int singerId = scanner.nextInt();

		    try {
		        List<Event> events = eventService.findById(singerId);

		        if (!events.isEmpty()) {
		            for (Event event : events) {
		                System.out.println("Event Details:");
		                System.out.println("Place: " + event.getPlace());
		                System.out.println("Singer Name: " + event.getSingername());
		                System.out.println("Ticket Price: " + event.getTicketprice());
		                System.out.println("Language: " + event.getLanguage());
		                System.out.println("Experience: " + event.getExperiance());
		                System.out.println("----------------------");
		            }
		        } else {
		            System.out.println("Event not found with singer Id: " + singerId);
		        }
		    } catch (EventNotFoundException e) {
		        System.out.println("Event not found with singer Id: " + singerId);
		    }
		}
			
		else if (choice==4) {
			System.out.println("Enter singer Id to delete event");
			int id = scanner.nextInt();
			eventService.deleteEvent(id);	
		}
		
	
}

}

