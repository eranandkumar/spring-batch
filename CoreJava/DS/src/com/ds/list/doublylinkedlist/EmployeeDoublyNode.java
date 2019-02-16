package com.ds.list.doublylinkedlist;

import com.ds.list.ListUtil.Employee;

public class EmployeeDoublyNode {

    private Employee data;
    private EmployeeDoublyNode nextLink;
    private EmployeeDoublyNode previousLink;


    public EmployeeDoublyNode(Employee data) {
        this.data = data;
    }

    public Employee getData() {
        return data;
    }

    public void setData(Employee data) {
        this.data = data;
    }

    public EmployeeDoublyNode getNextLink() {
        return nextLink;
    }

    public void setNextLink(EmployeeDoublyNode nextLink) {
        this.nextLink = nextLink;
    }

    public EmployeeDoublyNode getPreviousLink() {
        return previousLink;
    }

    public void setPreviousLink(EmployeeDoublyNode previousLink) {
        this.previousLink = previousLink;
    }


}
