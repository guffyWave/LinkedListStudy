package com.khurshid.gufran.linkedliststudy;

/**
 * Created by gufran on 11/2/18.
 */

public class Main {
    public static void main(String args[]) {
//        LinkedList linkedList = new LinkedList();
//
//        Node first = new Node(12);
//        linkedList.head = first;
//
//
//        Node second = new Node(16);
//        Node third = new Node(19);
//
//        first.next = second;
//        second.next = third;
//
//        linkedList.printList();
//
//        //linkedList.push(3);
//
//        // linkedList.printList();
//        System.out.println("--------------------------------");
//
//        // linkedList.insertAfter(second, 73);
//        // linkedList.append(91);
//        //linkedList.append(14);
//        // linkedList.append(83);
//        //linkedList.deleteKey(16);
//
//        //linkedList.printList();
//
//        linkedList.doublePointer();

        LinkedList linkedList = new LinkedList();
        linkedList.append(12);
        linkedList.append(23);
        linkedList.append(34);
        linkedList.append(45);
        linkedList.append(56);
        linkedList.append(67);
        linkedList.append(78);
        linkedList.printList();

        linkedList.deleteData(0);
        System.out.println("--------------------------------");

        linkedList.printList();





    }
}
