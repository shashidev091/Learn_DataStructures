package com.shashi.linkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
//        Node node = new Node();
        var node = new Node(item);

        if (isEmpty()) {
//            first = node;
//            last = node;
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;

        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void deleteFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }
        last = getPrevious(last);
        last.next = null;

    }

    private Node getPrevious(Node node) {
        var current = node;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }
}
