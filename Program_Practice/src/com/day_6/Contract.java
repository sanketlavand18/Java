package com.day_6;

public class Contract extends Employee {

    private int hr;
    private int charge;
    private int sal;

    public Contract(int id, String name, String mob, String desg, String dept, int hr, int charge) {
        super(id, name, mob, desg, dept);
        this.hr = hr;
        this.charge = charge;
    }

    @Override
    public void salaryCalculate() {
        sal = hr * charge;
    }

    @Override
    public String toString() {
        salaryCalculate();
        return super.toString() + " hr: " + hr + " charge: " + charge + " sal: " + sal;
    }
}