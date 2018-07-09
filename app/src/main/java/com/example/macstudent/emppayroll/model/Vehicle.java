package com.example.macstudent.emppayroll.model;

public abstract class Vehicle implements IPrintable{

        private String maker;
        private String regPlate;
        private String typeOfTransmission;
        private String color;

        public Vehicle()
        {

        }

        public String getMaker() {
            return maker;
        }

        public void setMaker(String maker) {
            this.maker = maker;
        }

        public String getRegPlate() {
            return regPlate;
        }

        public void setRegPlate(String regPlate) {
            this.regPlate = regPlate;
        }

        public String getTypeOfTransmission() {
            return typeOfTransmission;
        }

        public void setTypeOfTransmission(String typeOfTransmission) {
            this.typeOfTransmission = typeOfTransmission;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
