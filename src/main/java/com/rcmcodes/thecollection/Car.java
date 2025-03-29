package com.rcmcodes.thecollection;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//this class will represent each car in the db
@Document(collection = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {

    @Id
    private ObjectId id;
    private String toy_num;
    private String col_num;
    private String model;
    private String series;
    private String series_num;
    private String photo_url;
    private String year; 

    
}
