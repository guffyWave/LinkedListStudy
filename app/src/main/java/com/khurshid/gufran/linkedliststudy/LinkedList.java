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


    /* Given a key, deletes the first occurrence of key in linked list */
    public void deleteKey(int key) {

        Node temp = head;
        Node prev = null;

        //first head element is the data
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Key not found");
            return;
        }

        // Unlink the node from linked list
        prev.next = temp.next;

    }


    public void deleteData(int position) {
        int index = 0;

        Node temp = head;
        Node prev = null;

        if (position == 0) {
            head = temp.next;
            return;
        }

        while (temp != null) {
            if (position == index) {
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
            index++;
        }

    }

    public void doublePointer() {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            System.out.print("Prev " + ((prev != null) ? prev.data : "NULL ") + " , ");
            System.out.println("Temp " + temp.data);

            prev = temp;
            temp = temp.next;
        }

    }
}
