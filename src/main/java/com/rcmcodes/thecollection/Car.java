package com.rcmcodes.thecollection;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

//this class will represent each car in the db

@Document(collection = "cars")

public class Car {

    private ObjectId id;
    private String toy_num;
    private String col_num;
    private String model;
    private String series;
    private String series_num;
    private String photo_url;
    private String year; 

    
}
