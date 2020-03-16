package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.GameCaracter;

@Repository
public interface CaraRepository extends JpaRepository<GameCaracter,Integer> {

	List<GameCaracter> findById(int gameId);

}
