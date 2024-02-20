package com.cybage.Job_Quest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EventInfo")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eventId;
	private String eventName;
	private String posterImage;
	private String bannerImage;
	private String organizerName;
	private String tech;
	private String dateTime;
	private int noOfRegistration;
	private String aboutContest;
	private String rulesToFollow;
	private String rewards;
	private String aboutQrganizer;
	private double rating;
	private String contactDetails;
	private String founder;
	private String companySize;
	private String industryType;
	
	public Event(String eventName, String posterImage, String bannerImage, String organizerName, String tech,
			String dateTime, int noOfRegistration, String aboutContest, String rulesToFollow, String rewards,
			String aboutQrganizer, double rating, String contactDetails, String founder, String companySize,
			String industryType) {
		this.eventName = eventName;
		this.posterImage = posterImage;
		this.bannerImage = bannerImage;
		this.organizerName = organizerName;
		this.tech = tech;
		this.dateTime = dateTime;
		this.noOfRegistration = noOfRegistration;
		this.aboutContest = aboutContest;
		this.rulesToFollow = rulesToFollow;
		this.rewards = rewards;
		this.aboutQrganizer = aboutQrganizer;
		this.rating = rating;
		this.contactDetails = contactDetails;
		this.founder = founder;
		this.companySize = companySize;
		this.industryType = industryType;
	}
	
	
	
	
	
	
}
