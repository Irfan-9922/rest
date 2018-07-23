/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javateam.message.Message;
import org.javteam.service.MessageService;

/**
 * NAME:shaikh irfan
 *
 * TIME:3:44:52 am DATE:05-Dec-2017 TAGS:
 */
@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	MessageService se = new MessageService();

	@GET
	

	public List<Message> getall() {
		ArrayList al = se.getallmessages();
		return al;
	}
	@Path("/message/{id}")
	@GET
	
	public Message getSinglemessage(@PathParam("id") int id) {
		return se.getbiId(id);
	}

	@Path("/delete/{id}")
	public Message Deletemessage(@PathParam("id") int id) {
		return se.deletebyid(id);
	}
	@Path("/post")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Message creat(Message m) {
		return se.createresource(m);
	}
	@PUT
	@Path("/put")
	public Message up(Message m) {
		return se.update(m);

	}
}
