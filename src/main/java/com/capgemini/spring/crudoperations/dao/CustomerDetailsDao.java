package com.capgemini.spring.crudoperations.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capgemini.spring.crudoperations.model.CustomerDetails;

@Repository
public interface CustomerDetailsDao extends JpaRepository< CustomerDetails , Long>{

//	CustomerDetails findAllActiveUsersNative(long accountNo);
//	 @Query(value = "SELECT * FROM CustomerDetails u WHERE u.accountNo =  :accountNo", nativeQuery = true)
//	    public CustomerDetails findAllActiveUsersNative(@Param("accountNo") String accountNo);

}
