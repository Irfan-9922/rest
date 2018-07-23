/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javteam.service;

import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.PathParam;

import org.javateam.db.MessageDatabase;
import org.javateam.message.Message;

/**
 * NAME:shaikh irfan
 *
 * TIME:3:30:11 am
 *DATE:05-Dec-2017
 *TAGS:
 */
public class MessageService {
	
	private static Map<Integer,Message> mess=MessageDatabase.getmessage();
	
	public MessageService() {
mess.put(1, new Message(101,"hi this is java from irfan","irfan"));
mess.put(2, new Message(102,"hi this nisar","nisar"));
mess.put(3, new Message(103,"shi is may first girlforend","hajjo"));
mess.put(4, new Message(104,"shi is my second girlfriend","pooja"));
	}
	public ArrayList<Message> getallmessages(){
		 ArrayList< Message>	al= new  ArrayList< Message>(mess.values());
		
		return al;
	}
	
	 public Message getbiId (int id){
		 if(id==0){
			System.out.println("not found");
			return null;
		 }
		 return mess.get(id);
		 
		 
	 }
	 public Message deletebyid(int id){
		 if(id==0){
				System.out.println("not found");
				return null;
			 }
			 return mess.remove(id);
			 
	 }
	 
	 public Message createresource(Message m){
		 m.setId(mess.size()+1);
		 return mess.put(m.getId(), m);
	 }
	 public Message update(Message m){
	return	mess.put(m.getId(), m);
	 }

}
