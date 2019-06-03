package com.ing.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.ing.domain.ReviewHistory;

@Repository
public interface TransactionRepository extends JpaRepository<ReviewHistory, Integer>  {
	//@Query("Select u from ReviewHistory u where u.userId= :userId")
	//public Optional<ReviewHistory> viewHistory(int userId);
	
	List<ReviewHistory> findByUserId(int userId);
}
