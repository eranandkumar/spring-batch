package com.ds.sort.array.com.ds.list;

import com.ds.sort.array.com.ds.list.ListUtil.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;

    public void addToFront(Employee emp){
        EmployeeNode employeeNode = new EmployeeNode ( emp );
        employeeNode.setNext ( head );
        head = employeeNode;
    }
}
