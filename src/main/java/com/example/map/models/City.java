package com.example.map.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(	name = "City")
public class City {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cityId")
	private int cityId;
	private String name;
	
	public City() {}
	 public City(int cityId, String name) {
			super();
			this.cityId = cityId;
			this.name = name;
		}
    public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
   
	 
	

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "countryId")
//    private Country country;
}
