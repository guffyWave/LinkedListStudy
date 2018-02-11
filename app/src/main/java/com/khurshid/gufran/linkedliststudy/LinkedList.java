package com.khurshid.gufran.linkedliststudy;

/**
 * Created by gufran on 11/2/18.
 */

public class LinkedList {
    Node head;


    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }


    /* This function is in LinkedList class. Inserts a
   new Node at front of the list. This method is
   defined inside LinkedList class shown above */
    //Insert at First
    public void push(int new_data) {
/* 1 & 2: Allocate the Node &
              Put in the data*/
        Node newNode = new Node(new_data);
/* 3. Make next of new Node as head */
        newNode.next = head;
  /* 4. Move the head to point to new Node */
        head = newNode;

    }


    public void insertAfter(Node currentNode, int data) {

        if (currentNode == null) {
            System.out.println("Current node cannot be null ");
        }

        Node newNode = new Node(data);

        Node nextNode = currentNode.next;

        newNode.next = nextNode;

        currentNode.next = newNode;

    }

    /* Appends a new node at the end.  This method is
       defined inside LinkedList class shown above */
    public void append(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        //currentNode has become the last
        currentNode.next = newNode;
    }


}
