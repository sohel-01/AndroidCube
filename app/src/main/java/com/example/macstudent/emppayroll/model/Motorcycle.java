package com.example.macstudent.emppayroll.model;

public class Motorcycle extends Vehicle implements IPrintable {

    private String color;
    private String typeOfTransmission;



    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }
    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }
    @Override
    public void printMyData() {
        System.out.println(this.color + "  " + this.typeOfTransmission);

    }


}