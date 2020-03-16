package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GameWork;

@Repository
public interface DemoRepository extends JpaRepository<GameWork,Integer> {

	GameWork findById(int gameId);

}



