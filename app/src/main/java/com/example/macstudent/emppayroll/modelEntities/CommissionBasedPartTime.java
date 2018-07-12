package com.example.macstudent.emppayroll.modelEntities;

public  class CommissionBasedPartTime extends PartTime {
    public double getCommision() {
        return commision;
    }

    private double commision;

    @Override
    public double calcEarnings() {
        return getEmpHrRate()*getEmpWorkedHrs() + commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }
    public String printMyData()
    {
        return "commison "+ commision;
    }
}
