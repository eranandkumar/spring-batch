package com.ds.list.doublylinkedlist;

import com.ds.list.ListUtil.Employee;
import com.ds.list.singlylinkedlist.EmployeeLinkedList;

public class EmployeeDoublyLinkedListMain {
    public static void main(String[] args) {

        EmployeeDoublyLinkedList employeeLinkedList = new EmployeeDoublyLinkedList ();
        employeeLinkedList.addToFront ( new Employee ( 1, "Anand", "Kumar" )  );
        employeeLinkedList.addToFront ( new Employee ( 2, "Vivek", "ranjan" ) );
        employeeLinkedList.addToFront ( new Employee ( 3, "saurav", "kumar" ) );
        employeeLinkedList.addToFront ( new Employee ( 4, "mukesh", "kumar" ) );
        employeeLinkedList.addToFront ( new Employee ( 5, "Aman", "Akash" ) );

        employeeLinkedList.printDoublyLinkedList ();
    }
}
