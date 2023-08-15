package com.event.util;

public class Queries {
	public static final String CREATEQUERY = "create table event (singername varchar(20), singerId integer primary key auto_increment, place varchar(30),experiance int, ticketprice float,language varchar(20))";
	public static final String INSERTQUERY = "insert into event(singername, place,experiance,ticketprice,language) values(?,?,?,?,?)";
	public static final String UPDATEQUERY = "update event set ticketprice=? where singerId=?";
	public static final String QUERYBYID = "select * from event where singerId=?";
	public static final String GETALLQUERY = "select * from event";
	public static final String DELETEBYID = "delete from event where singerId=?";
	public static final String QUERYBYlanguage = "select * from event where language=?";
	public static final String QUERYBYLANGUAGEANDEXP = "select * from event where language=? and experiance>?";
	public static final String QUERYBYSINGERNAMEANDTICKETPRICE = "select * from event where singername=? and ticketprice<=?";
public static final String QUERYBYSINGERNAMEANDPLACE = "select * from event where singername=? and place=?";

}

