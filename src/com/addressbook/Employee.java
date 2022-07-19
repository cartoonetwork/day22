package com.addressbook;

public class Employee {
    int employeeId;
    String employeeName;
    int employeeAge;
    String employeeAddress;

    @Override
    public String toString() {
        return "Employee ID = " + employeeId +
                "| Employee Name = " + employeeName +
                "| Employee pin = " + employeeAge +
                "| Employee Address = " + employeeAddress;

    }
}

