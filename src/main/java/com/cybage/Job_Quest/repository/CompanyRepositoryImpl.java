package com.cybage.Job_Quest.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cybage.Job_Quest.model.Company;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository{

	@PersistenceContext 
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void saveCompany(Company company) {
		// TODO Auto-generated method stub
		entityManager.persist(company);
	}


	
}
