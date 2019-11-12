package com.techelevator.npgeek.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Survey {
	
	private Integer surveyId; // INTEGER PRIMARY KEY DEFAULT NEXTVAL('seq_surveyId'),
	
	// Dropdown in Survey form
	private String parkCode; // VARCHAR(10) NOT NULL,
	
	/*
	 * @Email(message = "Email must be a valid email address.")
	 * 
	 * @Size(max = 100, message = "Email must be less than 100 characters.")
	 * 
	 * @NotBlank(message = "Email cannot be blank.")
	 */
	private String emailAddress; // VARCHAR(100) NOT NULL,
	
	// Dropdown for user state in form
	private String state; // VARCHAR(30) NOT NULL,
	
	// Dropdown for activityLevel in form
	private String activityLevel; // VARCHAR(100) NOT NULL

	/**
	 * @return the surveyId
	 */
	public Integer getSurveyId() {
		return surveyId;
	}

	/**
	 * @return the parkCode
	 */
	public String getParkCode() {
		return parkCode;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the activityLevel
	 */
	public String getActivityLevel() {
		return activityLevel;
	}

	/**
	 * @param surveyId the surveyId to set
	 */
	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	/**
	 * @param parkCode the parkCode to set
	 */
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @param activityLevel the activityLevel to set
	 */
	public void setActivityLevel(String activityLevel) {
		this.activityLevel = activityLevel;
	}

}
