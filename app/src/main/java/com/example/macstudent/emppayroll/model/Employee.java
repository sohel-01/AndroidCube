package com.example.macstudent.emppayroll.model;

    public abstract class Employee implements IPrintable{
        private String name;
        private int age;
        private double earnings;
        private Vehicle vehicle;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double calcEarnings() {
            return earnings;
        }

        public double getEarnings() {
            return earnings;
        }

        public void setEarnings(double val) {
            earnings = val;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        public int calcBrithYear() {
            return 2018 - age;
        }
    }
