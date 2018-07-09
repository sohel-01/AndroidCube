package com.example.macstudent.emppayroll.model;

public class Intern extends Employee implements IPrintable {

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void printMyData() {
        System.out.println("Name : " + this.getName()+"\nYear of Birth :" + this.calcBrithYear() + "\nEmployee has no Vehicle\nEmployee is Intern\n\tSchool :"
                +this.schoolName+"\n\tEarnings :"+this.getEarnings());
    }
    public void printIntern2(){
        System.out.println("Name : " + this.getName()+"\nYear of Birth :" +this.calcBrithYear() + "\nEmployee has Car \n\tMaker : "+getVehicle().getMaker()
                +"\n\tLicense Plate : "+getVehicle().getRegPlate()+"\n\tType of Transmission : "+getVehicle().getTypeOfTransmission()+"\n\tColor : "+getVehicle().getColor()+"\nEmployee is Intern\n\tSchool :"
                +this.schoolName+"\n\tEarnings :"+this.getEarnings());
    }
}
