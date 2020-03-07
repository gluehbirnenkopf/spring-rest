package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Data;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

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
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
}
