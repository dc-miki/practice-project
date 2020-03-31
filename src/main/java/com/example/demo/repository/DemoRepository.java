package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GameWork;

@Repository
public interface DemoRepository extends JpaRepository<GameWork,Integer> {

	GameWork findById(int gameId);

	/*    @Query("SELECT * FROM Account a WHERE :createdDateFrom <= a.createdDate AND a.createdDate < :createdDateTo ORDER BY a.createdDate DESC")
	List<GameWork> findByCreatedDate(
	        @Param("createdDateFrom") Date createdDateFrom,
	        @Param("createdDateTo") Date createdDateTo);
	*/
}



