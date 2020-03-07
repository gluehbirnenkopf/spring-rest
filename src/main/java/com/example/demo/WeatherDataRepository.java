package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


@Repository
public class WeatherDataRepository {

	Logger logger = LoggerFactory.getLogger(WeatherDataRepository.class);

	
    private Map data = new HashMap<>();
    private int nextId = 0;

    public void create(WeatherData record) {
        if(record.getId() == null) {
            record.setId(nextId);
            nextId++;
        }

        data.put(record.getId(), record);
    }

    public WeatherData findById(int id) {
        return (WeatherData) data.get(id);
    }

    public Collection findAll() {
        return data.values();
    }
}
