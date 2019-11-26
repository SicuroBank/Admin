package com.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.entity.OpenAccount;
import com.admin.exception.ResourceNotFoundException;
import com.admin.repositories.AdminRepos;
@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	AdminRepos theAdminRepos;

	@Transactional
	public List<OpenAccount> getOpenAccounts() {
		
		return theAdminRepos.findAll();
	}

	
	@Transactional
	public void saveOpenAccount(OpenAccount theOpenAccount) {
		theAdminRepos.save(theOpenAccount);		
	}

	@Transactional
	public OpenAccount getOpenAccount(long theId) throws ResourceNotFoundException {
		return theAdminRepos.findById(theId).orElseThrow( () ->  new ResourceNotFoundException(theId));
	}

	@Transactional
	public void deleteOpenAccount(long theId) throws ResourceNotFoundException{
		theAdminRepos.deleteById(theId);
	}



}
