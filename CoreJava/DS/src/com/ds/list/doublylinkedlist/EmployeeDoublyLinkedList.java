package com.ds.list.doublylinkedlist;

import com.ds.list.ListUtil.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeDoublyNode node = new EmployeeDoublyNode (employee);
        node.setNextLink ( head );

        if (head == null){
            tail = node;
        }else {
            head.setPreviousLink ( node );
        }

        head = node;
        size++;
    }
}
