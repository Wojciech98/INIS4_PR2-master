package com.company;

import javax.xml.crypto.Data;

public class Car {


    String producer;
    String model;
    Integer yearOfProduction;
    String plates;
    int carCost=200;


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates)throws Exception {

        if(plates.length()>8){
            throw new Exception();
        }else {
            this.plates = plates;
        }
    }


}
