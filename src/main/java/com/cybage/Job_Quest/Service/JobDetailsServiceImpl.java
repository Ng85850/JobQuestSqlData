package com.cybage.Job_Quest.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.Job_Quest.model.JobDetail;
import com.cybage.Job_Quest.repository.JobDetailsRepository;

@Service
public class JobDetailsServiceImpl  implements JobDetailsService{

	@Autowired
	private JobDetailsRepository jobDetailsRepository;

	@Override
	@Transactional
	public void saveJobDetails(JobDetail jobDetail) {
		// TODO Auto-generated method stub
		jobDetailsRepository.saveJobDetails(jobDetail);
	}
	
	
}
