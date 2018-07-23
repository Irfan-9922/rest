/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.message;

import java.util.Date;

/**
 * NAME:shaikh irfan
 *
 * TIME:3:25:54 am
 *DATE:05-Dec-2017
 *TAGS:
 */
public class Message {
	/**
	 * 
	 */
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String message;
	private String author;
	private Date date;
	/**
	 * 
	 */
	
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 * @param message
	 * @param author
	 * @param date
	 */
	public Message(int id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.date = new Date();
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
