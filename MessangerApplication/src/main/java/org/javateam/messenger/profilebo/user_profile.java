/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.messenger.profilebo;

import java.util.Date;

/**
 * NAME:shaikh irfan
 *
 * TIME:1:22:10 pm
 *DATE:04-Dec-2017
 *TAGS:
 */
public class user_profile {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "user_profile [profileId=" + profileId + ", profileName=" + profileName + ", profileCreatedDate="
				+ profileCreatedDate + "]";
	}
	public int profileId;
	private String profileName;
	private Date profileCreatedDate;
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public Date getProfileCreatedDate() {
		return profileCreatedDate;
	}
	public void setProfileCreatedDate(Date profileCreatedDate) {
		this.profileCreatedDate = profileCreatedDate;
	}
	
}