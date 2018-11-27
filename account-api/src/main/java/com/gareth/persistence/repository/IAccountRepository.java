package com.gareth.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gareth.persistence.domain.Account;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Long>{

}
