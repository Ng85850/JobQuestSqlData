package com.cybage.Job_Quest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jobDetails")
public class JobDetail {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int jobId;
	private String JobName;
	private String expReq;
	private String location;
	private String postedAgo;
	private int noOfApplicant;
	private String jobDesc;
	private String role;
	private String industryType;
	private String department;
	private String empType;
	private String roleCategory;
	private String education;
	private String keySkills;
	private double salRangeMin;
	private double salRangeMax;
	private String workMode;
	private String compType;
	private int compId;
	
	public JobDetail(String jobName, String expReq, String location, String postedAgo, int noOfApplicant,
			String jobDesc, String role, String industryType, String department, String empType, String roleCategory,
			String education, String keySkills, double salRangeMin, double salRangeMax, String workMode, String compType,
			int compId) {
		super();
		JobName = jobName;
		this.expReq = expReq;
		this.location = location;
		this.postedAgo = postedAgo;
		this.noOfApplicant = noOfApplicant;
		this.jobDesc = jobDesc;
		this.role = role;
		this.industryType = industryType;
		this.department = department;
		this.empType = empType;
		this.roleCategory = roleCategory;
		this.education = education;
		this.keySkills = keySkills;
		this.salRangeMin = salRangeMin;
		this.salRangeMax = salRangeMax;
		this.workMode = workMode;
		this.compType = compType;
		this.compId = compId;
	}
	
	
}
