/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.messenger.profile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.javateam.messenger.profile.db.profiledb;
import org.javateam.messenger.profilebo.user_profile;

import sun.applet.Main;

/**
 * NAME:shaikh irfan
 *
 * TIME:1:18:00 pm
 *DATE:04-Dec-2017
 *TAGS:
 */
public class Profiles {
	
	/*
	 * 1= create the profiles and add to db
	 */

	
	public Profiles (){
		user_profile p=new user_profile();
		p.setProfileId(1);
		p.setProfileName("irfan");
		p.setProfileCreatedDate(new Date());
		
		user_profile p1=new user_profile();
		p1.setProfileId(2);
		p1.setProfileName("nisar");
		p1.setProfileCreatedDate(new Date());
		profiledb.addprofile(p1);
		profiledb.addprofile(p);
	}
	
	/*public static void main(String[] args) {
		Profiles p=new Profiles();
		profiledb.getProfile();
	}*/
		
		
	}
	
	
	
	
	


