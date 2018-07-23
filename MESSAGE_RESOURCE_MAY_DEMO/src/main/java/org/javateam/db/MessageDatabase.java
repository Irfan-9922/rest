/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.db;

import java.util.HashMap;
import java.util.Map;

import org.javateam.message.Message;

/**
 * NAME:shaikh irfan
 *
 * TIME:3:28:00 am
 *DATE:05-Dec-2017
 *TAGS:
 */
public class MessageDatabase {
	public static Map<Integer,Message> messages=new HashMap();
	
	public static Map<Integer,Message> getmessage(){
		return messages;
	}

}
