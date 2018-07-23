/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.database;

import java.util.HashMap;
import java.util.Map;

import org.javateam.model.Message;
import org.javateam.model.Profile;

/**
 * NAME:shaikh irfan
 *
 * TIME:9:57:12 pm
 *DATE:04-Dec-2017
 *TAGS:
 */
public class database {
	
	public static Map<Integer,Message> message=new HashMap();
	public static Map<Integer,Profile> profile=new HashMap();
	
	
	public static Map<Integer,Message>getmessges(){
		return message;
	}
	public static Map<Integer, Profile> getprofile(){
		return profile;
	}

}
