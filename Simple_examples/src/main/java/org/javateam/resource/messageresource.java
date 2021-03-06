/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javateam.model.Message;
import org.javateam.model.service.MessageService;

/**
 * NAME:shaikh irfan
 *
 * TIME:8:43:44 pm
 *DATE:04-Dec-2017
 *TAGS:
 */
@Path("hi")
public class messageresource {
	MessageService service=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> shoe(){
		return service.getallmessages();
	}
     @GET
	@Path("me/{id}")
	public Message getbyn(@PathParam("id")Integer i){
		
	  return service.getbyid(i);
		
	}
	
	@Path("/fo")
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Message postme(Message m){
		return service.creatmessage(m);
		
	}
}
