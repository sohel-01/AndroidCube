package com.example.macstudent.emppayroll.model;

    public abstract class PartTime extends Employee implements IPrintable {

        private double rate;
        private int hoursWorked;

        public double getRate() {
            return rate;
        }
        public void setRate(double rate) {
            this.rate = rate;
        }
        public int getHoursWorked() {
            return hoursWorked;
        }
        public void setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

    }
