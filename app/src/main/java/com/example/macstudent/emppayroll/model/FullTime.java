package com.example.macstudent.emppayroll.model;

    public class FullTime extends Employee implements IPrintable {

        private double salary;
        private double bonus;

        public double calEarnings() {
            return salary + bonus;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        @Override
        public void printMyData() {
            System.out.println("Name : "+this.getName() +"\nYear of Birth : "+this.calcBrithYear()
                    +"\nEmployee has a Car \n\tMaker : "+getVehicle().getMaker()+"\n\tRegistration Number : "+getVehicle().getRegPlate()
                    +"\n\tType of Transmission : "+getVehicle().getTypeOfTransmission()+"\n\tColour : "+getVehicle().getColor()+"\nEmployee is FullTime\n\tSalary : "+this.salary
                    +"\n\tBonus : "+this.bonus+"\n\tEarnings : "+this.calEarnings());

        }

    }