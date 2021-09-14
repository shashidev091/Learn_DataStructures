package com.shashi.linkedList;
import java.util.LinkedList;

public class MyLinkedList {
    Node head;

    public void add(int data) {
        Node toAdd = new Node(data);

        if ( isEmpty() ) {
            head = toAdd;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = toAdd;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            head = newNode;
            return;
        }

        Node temp = head;
        head = newNode;
        newNode.next = temp;
    }

    public void set(int index, int data) {
        Node newItem = new Node(data);

        if (isEmpty()) {
            throw new IllegalArgumentException();
        }

        int findindex = 0;
        var current = head;
        Node prevuios = null;

        while (current != null) {
            if (findindex == index) {
               break;
            }
            findindex++;
            prevuios = current;
            current = current.next;
        }

        Node temp = current;
//        if(prevuios != null) {
//            System.out.println(prevuios.data);
//        }
        newItem.next = current;
        prevuios.next = newItem;

    }

    public void print() {
        var current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
