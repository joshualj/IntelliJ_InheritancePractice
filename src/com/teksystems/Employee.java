package com.teksystems;

public class Employee {
    public long employeeId;
    public String employeeName;
    public String employeeAddress;
    public long employeePhone;
    public double basicSalary;
    public double specialAllowance = 250.80;
    public double hra = 1000.50;

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary(){
        double salary = basicSalary + (basicSalary * (this.specialAllowance / 100)) + (basicSalary * hra/100);
        return salary;
    }

    public double calculateTransportAllowance(){
        double transportAllowance = (0.1)*basicSalary;
        return transportAllowance;
    }
}
