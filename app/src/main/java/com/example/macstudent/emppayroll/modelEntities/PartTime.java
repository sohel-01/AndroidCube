package com.example.macstudent.emppayroll.modelEntities;

public abstract class PartTime extends Employee {
    private double empHrRate;
    private float empWorkedHrs;
    @Override
    public String getSchoolName() {
        return "";
    }

    public double getEmpHrRate() {
        return empHrRate;
    }

    public void setEmpHrRate(double empHrRate) {
        this.empHrRate = empHrRate;
    }

    public float getEmpWorkedHrs() {
        return empWorkedHrs;
    }

    public void setEmpWorkedHrs(float empWorkedHrs) {
        this.empWorkedHrs = empWorkedHrs;
    }
}
