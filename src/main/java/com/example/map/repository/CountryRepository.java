package com.example.map.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.map.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {

	
}
