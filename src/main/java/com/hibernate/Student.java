package com.hibernate;
public class Student {

    private String sName;
    private int rollNo;
    private int sAge;   

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("sName=").append(sName);
        sb.append(", rollNo=").append(rollNo);
        sb.append(", sAge=").append(sAge);
        sb.append('}');
        return sb.toString();
    }


   
}
