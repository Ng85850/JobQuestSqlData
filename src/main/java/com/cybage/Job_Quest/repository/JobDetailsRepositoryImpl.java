package com.cybage.Job_Quest.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cybage.Job_Quest.model.JobDetail;

@Repository
public class JobDetailsRepositoryImpl implements JobDetailsRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void saveJobDetails(JobDetail jobDetail) {
		// TODO Auto-generated method stub
		entityManager.persist(jobDetail);
	}
	
	
}
