/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * NAME:shaikh irfan
 *
 * TIME:11:58:46 am
 *DATE:04-Dec-2017
 *TAGS:
 */
@Path("hello")
public class simpledemo {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String fo(){
		System.out.println("hrllo");
		return "hello irfan";
	}

}
