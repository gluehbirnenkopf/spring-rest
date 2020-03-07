package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Data;

@Data
public class WeatherData {
    
	Logger logger = LoggerFactory.getLogger(WeatherData.class);

	
	private int id;
    private int stationId;
    private int temperature;
    private int humidity;
    private Double latitude;
    private Double longitude;
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setId(int nextId) {
		// TODO Auto-generated method stub
		
	}
}
