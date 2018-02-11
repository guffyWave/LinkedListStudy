package com.khurshid.gufran.linkedliststudy;

/**
 * Created by gufran on 11/2/18.
 */

public class LinkedList {
    Node head;


    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}
