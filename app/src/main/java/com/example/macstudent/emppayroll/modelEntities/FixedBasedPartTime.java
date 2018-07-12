package com.example.macstudent.emppayroll.modelEntities;

public class FixedBasedPartTime extends PartTime {
    public double getFixedAmount() {
        return fixedAmount;
    }

    private double fixedAmount;


    @Override
    public double calcEarnings() {
        return getEmpHrRate()*getEmpWorkedHrs() + fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
}
