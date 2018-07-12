package com.example.macstudent.emppayroll.modelEntities;

public class Intern extends Employee implements IPrintable {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String printMyData() {
        return super.printMyData();
    }
}


