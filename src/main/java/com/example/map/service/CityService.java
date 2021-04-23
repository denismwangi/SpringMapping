package com.example.map.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.map.models.City;
import com.example.map.repository.CityRepository;


@Service
public class CityService {
	
    @Autowired
    private CityRepository cityRepository;
    
    public List<City> getCities(){
        return cityRepository.findAll();
    }
    public City getCity(int id){
        Optional<City> city = cityRepository.findById(id);
//        if(!city.isPresent())
//            throw new NotFoundException("City not found!");
        return city.get();
    }
    public City addCity(City city){
        return cityRepository.save(city);
    }
    public City updateCity(int id,City city){
        city.setCityId(id);
        return cityRepository.save(city);
    }
    public void deleteCity(int id){
        cityRepository.deleteById(id);
    }
}