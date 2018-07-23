/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.javateam.database.database;
import org.javateam.model.Message;

/**
 * NAME:shaikh irfan
 *
 * TIME:9:02:58 pm
 *DATE:04-Dec-2017
 *TAGS:
 */
public class MessageService {
     public Map<Integer,Message> message=database.getmessges();
     
 
	public MessageService() {
    
		message.put(1, new Message(101,"hi","irfan"));
		message.put(2, new Message(102,"hello","nisar"));
		message.put(3, new Message(103,"ummmi","hema"));
	}
     
	public List<Message> getallmessages(){
	return	new ArrayList<Message>(message.values());
		
	}
	public Message getbyid(Integer id){
		return message.get(id);
	}
	
	public Message remove(Integer id){
		return message.remove(id);
	}
	
	public Message creatmessage(Message m){
		m.setId(message.size()+1);
		message.put(m.getId(), m);
		return m;
		
	}
	public Message uapdte(Message m){
		message.put(m.getId(), m);
		return m;
	}

}
