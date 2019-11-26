package com.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.entity.OpenAccount;

public interface AdminRepos extends  JpaRepository<OpenAccount, Long> {

}
