/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.javateam.model.Student;
import org.javateam.service.StudentService;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:11:12 am
 *DATE:05-Dec-2017
 *TAGS:
 */
@Path("/student")
public class resource {
	StudentService ser=new StudentService();
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public Student crest(Student s){
		return ser.creatStudent(s);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List< Student> getall(){
		return ser.getallStudent();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{id}")
	public Student byId(@PathParam("id") int id){
		return ser.getById(id);
	}
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public Student update(Student s){
		return ser.updatest(s);
	}
	
	@DELETE
	@Path("/{id}")
	public void remov(@PathParam("id") int id){
		 ser.remove(id);
	}
	
	

}
