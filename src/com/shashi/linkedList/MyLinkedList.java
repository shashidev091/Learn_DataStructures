package com.shashi.linkedList;

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
        Node nextNode = null;

        while (current != null) {
            if (findindex == index) {
               break;
            }
            findindex++;

            current = current.next;
        }

        if (current == null) {
            return;
        }

        nextNode = current.next;
        current.next = newItem;
        newItem.next = nextNode;

    }

    public void print() {
        var current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void reverse() {
        var current = head;

        Node tempNode = null;
        Node lastNode = null;
        while (current != null ) {
            lastNode = current;
            current = current.next;
        }

        if( lastNode != null ) {
            tempNode = head;
            head = lastNode;
            lastNode = tempNode;

        }



    }

    public void reverseSecond() {
        var previous = head;
        var current = head.next;

        while ( current != null ) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
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

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
