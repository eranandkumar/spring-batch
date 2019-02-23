package com.ds.list.doublylinkedlist;

import com.ds.list.ListUtil.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;

    /*
    To understand this assume 2 case.
    case 1- when we add first element to Doubly linked list
    In this case head and tail is null and when we add 1st tempNode
    then if block will be executed, tail will contain refrence of tempNode
    and head will also point to tempNode refrence.

    case 2- Now when we 2nd element(tempNode), else block will be executed
    -->tempNode refrence needs to set to previousLink of Head
    -->tempNode nextLink needs to point to head.
    -->head = tempNode
     */
  public void addToFront(Employee data){
      EmployeeDoublyNode tempNode = new EmployeeDoublyNode ( data );
      if (isEmpty()){
          tail = tempNode;
      }else {
          head.setPreviousLink ( tempNode );
      }

      tempNode.setNextLink ( head );
      head = tempNode;
  }

  public void printDoublyLinkedList(){
      if (isEmpty ()){
          return;
      }

      EmployeeDoublyNode node = head;
      System.out.println ();
      while (node != null){
          System.out.println (node.getData ());
          node = node.getNextLink ();
      }
      System.out.println ("null");
  }

  public  boolean isEmpty(){
      return head == null;
  }
}
