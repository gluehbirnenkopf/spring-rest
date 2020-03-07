package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.LoggerFactory;

import java.util.Collection;

import org.slf4j.Logger;

@RestController
public class WeatherDataController {

	
    Logger logger = LoggerFactory.getLogger(WeatherDataController.class);
    
    private WeatherDataRepository dataRepository;

    WeatherDataController(@Autowired WeatherDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/weather")
    public void createWeatherData(@RequestBody WeatherData weatherData) {
    	logger.info("received POST request with WeatherData"+weatherData);
        this.dataRepository.create(weatherData);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/weather")
    public Collection retrieveWeatherData() {
    	logger.info("received GET request");
        return this.dataRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/weather1/{id}")
    public WeatherData retrieveWeatherData(@PathVariable int id) {
    	logger.info("User queried id: ", id);
    	return dataRepository.findById(id);
    }
}
