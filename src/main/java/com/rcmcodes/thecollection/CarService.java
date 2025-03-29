package com.rcmcodes.thecollection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CarService {

@Autowired
private CarRepository carRepository;
public List<Car> allCars(){
    return carRepository.findAll();
}
    
}
