package com.ds.sort.array.com.ds.list;

import com.ds.sort.array.com.ds.list.ListUtil.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    /*
    In Singly LinkedList We are adding element in the Front
    of LinkedList.
    1. For Adding new Element in LinkedList we will create node and
    add the value to Node.
    2. Current head element we will set to next element.
    3. New Element is now point to Current Head.
     */
    public void addToFront(Employee emp){
        EmployeeNode employeeNode = new EmployeeNode ( emp );
        employeeNode.setNext ( head );
        head = employeeNode;
        size++;
    }


    public void printList(){
        EmployeeNode currentNode = head;
        System.out.println ();
        while (currentNode != null){
            System.out.println (currentNode);
            currentNode = currentNode.getNext ();
        }
        System.out.println ("null");
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public EmployeeNode deleteFromFront(){
        EmployeeNode removeNode = head;
        head = head.getNext ();
        removeNode.setNext ( null );
        size--;
        return removeNode;
    }
}
