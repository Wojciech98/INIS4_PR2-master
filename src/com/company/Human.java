package com.company;

public class Human extends Animal {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    boolean gender;


    private Double salry = 1000.0;

    public Human(String species) {
        super(species);
    }


    public Double getSalry() {
        return salry;
    }

    public void setSalry(Double salry) {
        this.salry = salry;
    }

    public void riseMySalry(){
        this.salry *=1.1;
    }

    public String buyCar(){
        if(this.salry>car.carCost){

            return   "You can buy car";
        }
        else {

            return "You not enough money";
        }

    }

    public String whoDrive(){
        if(this.gender==true){
            return "male drive";
        }else
            return "female drive";
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }




    public String nameAndLast(){


        return firstName+" "+lastName;
    }
}
