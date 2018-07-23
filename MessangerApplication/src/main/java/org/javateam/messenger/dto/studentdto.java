/**@COPYRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package org.javateam.messenger.dto;

import java.util.Date;

/**
 * NAME:shaikh irfan
 *
 * TIME:6:47:55 pm
 *DATE:04-Dec-2017
 *TAGS:
 */
public class studentdto {
	public int profileId;
	private String profileName;
	/**
	 * @param profileId
	 * @param profileName
	 * @param profileCreatedDate
	 */
	public studentdto(int profileId, String profileName, Date profileCreatedDate) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
		this.profileCreatedDate = profileCreatedDate;
	}
	private Date profileCreatedDate;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "studentdto [profileId=" + profileId + ", profileName=" + profileName + ", profileCreatedDate="
				+ profileCreatedDate + "]";
	}
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
