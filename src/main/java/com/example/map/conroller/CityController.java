package com.example.map.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.map.models.City;
import com.example.map.service.CityService;

@RestController
@RequestMapping("/api/v1")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    public List<City> getCities(){
        return cityService.getCities();
    }
    @GetMapping("/city/{id}")
    public City getCity(@PathVariable int id){
        return cityService.getCity(id);
    }
    @PostMapping("/city/create")
    public City addCity(@RequestBody City city){
        return cityService.addCity(city);
    }
    @PutMapping("/city/{id}")
    public City addCity(@PathVariable int id,@RequestBody City city){
        return cityService.updateCity(id,city);
    }
    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable int id){
        cityService.deleteCity(id);
    }
}