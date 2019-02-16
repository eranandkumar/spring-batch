package com.ds.list.ListUtil;

import java.util.Objects;

public class Employee {
    private int empId;
    private String firstName;
    private String lastName;

    public Employee() {
    }

    public Employee(int empId, String firstName, String lastName) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                Objects.equals ( firstName, employee.firstName ) &&
                Objects.equals ( lastName, employee.lastName );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( empId, firstName, lastName );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
