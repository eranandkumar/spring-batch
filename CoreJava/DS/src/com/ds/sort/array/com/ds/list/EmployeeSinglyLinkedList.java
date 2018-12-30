package com.ds.sort.array.com.ds.list;

import com.ds.sort.array.com.ds.list.ListUtil.Employee;

public class EmployeeSinglyLinkedList {
    public static void main(String[] args) {

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList ();
        employeeLinkedList.addToFront ( new Employee ( 1, "Anand", "Kumar" )  );
        employeeLinkedList.addToFront ( new Employee ( 5, "Aman", "Akash" ) );

    }
}
