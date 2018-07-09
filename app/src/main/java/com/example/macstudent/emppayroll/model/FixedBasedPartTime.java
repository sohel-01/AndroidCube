package com.example.macstudent.emppayroll.model;

public class FixedBasedPartTime extends PartTime implements IPrintable{

    private double fixedAmount;
    static double ear;

    public double calcEarnings() {
        ear = this.getRate()*this.getHoursWorked();
        double com =fixedAmount;
        return ear+com;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    @Override
    public void printMyData() {
        System.out.println("Name : "+this.getName()+"\nYear of Birth : "+this.calcBrithYear()
                +"\nEmployee has a MotorCycle\n\tMaker : "+getVehicle().getMaker()+"\n\tLicense Plate : "+getVehicle().getRegPlate()
                +"\n\tType of Transmission : "+getVehicle().getTypeOfTransmission()+"\n\tColour : "+getVehicle().getColor()
                +"\nEmployee is PartTime / Fixed Amt\n\t Rate : "+this.getRate()+"\n\tHours Worked : "+this.getHoursWorked()
                +"\n\tFixed Amount : "+this.fixedAmount+"\n\tEarnings : "+this.calcEarnings()+"("+FixedBasedPartTime.ear+" + "+this.fixedAmount+")");
    }
}