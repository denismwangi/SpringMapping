package com.example.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.map.models.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}
