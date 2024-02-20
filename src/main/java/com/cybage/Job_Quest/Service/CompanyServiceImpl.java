package com.cybage.Job_Quest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.Job_Quest.model.Company;
import com.cybage.Job_Quest.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public void saveCompany(Company company) {
		// TODO Auto-generated method stub
		companyRepository.saveCompany(company);
		
	}
	
	
}
