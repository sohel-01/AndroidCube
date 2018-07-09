package com.example.macstudent.emppayroll.model;

public class CommissionBasedPartTime extends PartTime implements IPrintable{

    private double commissionPercent;
    static double ear;
    static double comm;

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(int commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public double calEarnings() {
        ear = this.getRate()*this.getHoursWorked();
        comm = (commissionPercent/100)*ear;
        return ear+comm;
    }

    @Override
    public void printMyData() {
        System.out.println("Name : "+this.getName()
                +"\nYear of Birth : "+this.calcBrithYear()
                +"\nEmployee has a Car\n\tMaker : "+getVehicle().getMaker()
                +"\n\tRegistration Number : "+getVehicle().getRegPlate()
                +"\n\tType of Transmission : "+getVehicle().getTypeOfTransmission()
                +"\n\tColour : "+getVehicle().getColor()
                +"\nEmployee is a PartTime / Commissioned\n\tRate : "+this.getRate()
                +"\n\tHours Worked : "+this.getHoursWorked()
                +"\n\tCommission : "+this.getCommissionPercent()
                +"%"+"\n\tEarnings : "+this.calEarnings()
                +"("+CommissionBasedPartTime.ear+" + "+this.getCommissionPercent()
                +"%"+" of "+CommissionBasedPartTime.ear+")");

    }

}