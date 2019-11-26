package com.admin.service;

import java.util.List;


import com.admin.entity.OpenAccount;
import com.admin.exception.ResourceNotFoundException;



public interface AdminService {

	public List <OpenAccount> getOpenAccounts();

    public void saveOpenAccount(OpenAccount theOpenAccount);
  
    public OpenAccount getOpenAccount(long theId) throws ResourceNotFoundException;

    public void deleteOpenAccount(long theId) throws ResourceNotFoundException;


}
