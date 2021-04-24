package com.example.map.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.map.models.Country;
import com.example.map.service.CountryService;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public List<Country> getCountries(){
        return countryService.getCountries();
    }
    @GetMapping("/country/{id}")
    public Country getCountry(@PathVariable int id){
        return countryService.getCountry(id);
    }
    @PostMapping("/country/create")
    public Country addCountry(@RequestBody Country country){
        return countryService.addCountry(country);
    }
    @PutMapping("/country/{id}")
    public Country addCountry(@PathVariable int id,@RequestBody Country country){
        return countryService.updateCountry(id,country);
    }
    @DeleteMapping("/country/{id}")
    public void deleteCountry(@PathVariable int id){
        countryService.deleteCountry(id);
    }
}
