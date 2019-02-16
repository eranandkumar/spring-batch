package com.ds.list.singlylinkedlist;

import com.ds.list.ListUtil.Employee;

public class EmployeeSinglyLinkedList {
    public static void main(String[] args) {

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList ();
        employeeLinkedList.addToFront ( new Employee ( 1, "Anand", "Kumar" )  );
        employeeLinkedList.addToFront ( new Employee ( 2, "Vivek", "ranjan" ) );
        employeeLinkedList.addToFront ( new Employee ( 3, "saurav", "kumar" ) );
        employeeLinkedList.addToFront ( new Employee ( 4, "mukesh", "kumar" ) );
        employeeLinkedList.addToFront ( new Employee ( 5, "Aman", "Akash" ) );

        employeeLinkedList.printList ();
        System.out.println ( employeeLinkedList.getSize () );
        System.out.println ( "****************************************");
        employeeLinkedList.deleteFromFront ();
        employeeLinkedList.printList ();
    }
}
