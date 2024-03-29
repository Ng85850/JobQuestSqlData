package com.cybage.Job_Quest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="CompanyInfo")

public class Company  {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int compId;
		private String compName;
		private String compDesc;
		private String tag1;
		private String tag2;
		private String tag3;
		private String tag4;
		private String compVideoUrl;
		private String compTagLine;
		private String compWebsiteUrl;
		private String foundedAt;
		private String compType;
		private String compHeadquaters;
		private double compRating;
		private String noOfFollower;
		private String compBannerImg;
		private String compPosterImg;
		
		public Company(String compName, String compDesc, String tag1, String tag2, String tag3, String tag4,
				String compVideoUrl, String compTagLine, String compWebsiteUrl, String foundedAt, String compType,
				String compHeadquaters, double compRating, String noOfFollower, String compBannerImg,
				String compPosterImg) {
			this.compName = compName;
			this.compDesc = compDesc;
			this.tag1 = tag1;
			this.tag2 = tag2;
			this.tag3 = tag3;
			this.tag4 = tag4;
			this.compVideoUrl = compVideoUrl;
			this.compTagLine = compTagLine;
			this.compWebsiteUrl = compWebsiteUrl;
			this.foundedAt = foundedAt;
			this.compType = compType;
			this.compHeadquaters = compHeadquaters;
			this.compRating = compRating;
			this.noOfFollower = noOfFollower;
			this.compBannerImg = compBannerImg;
			this.compPosterImg = compPosterImg;
		}
	
	
		
}
