package com.day_6;

public class SalaryEmp extends Employee {

    private double sal;
    private int bonusPercentage;
    private double totalSalary;

    public SalaryEmp(int id, String name, String mob, String desg, String dept, double sal, int bonusPercentage) {
        super(id, name, mob, desg, dept);
        this.sal = sal;
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public void salaryCalculate() {
        double bonus = sal * bonusPercentage / 100.0;
        totalSalary = sal + bonus;
    }

    @Override
    public String toString() {
        salaryCalculate();
        return super.toString() + " sal: " + sal + " totalSalary: " + totalSalary;
    }
}