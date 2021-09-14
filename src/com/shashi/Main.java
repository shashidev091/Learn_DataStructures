package com.shashi;

import com.shashi.arrays.Arrayss;
import com.shashi.linkedList.LinkedList;
import com.shashi.linkedList.MyLinkedList;
import com.shashi.stacks.Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Arrayss array = new Arrayss(4);
//        array.print();
//
//        array.insert(1);
//        array.insert(5);
//        array.insert(2);
//
//        array.print();
//        System.out.println();
//        array.removeAt(2);
//        array.print();
//        int a = array.indexOf(5);
//        System.out.println(a);
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(2);
//
//        System.out.println(arr);


        /*
         * Linked List
         */

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(4);
//        list.add(6);
//
//        System.out.println(list);
//        list.removeLast();
//
//        System.out.println(list);
//        System.out.println(list.size());

        /*
        Custom Linked-List
         */

//        LinkedList list = new LinkedList();
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(5);
//        list.addLast(7);
//
//        System.out.println(list.contains(3));
//        System.out.println(list.size());
//        list.reverse();
//        System.out.println(list);

        /*
        Stacks in Java
         */

//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println(stack);
//        stack.pop();
//
//        System.out.println(stack);
//        reverseString("abcded");
//
//    }
//
//    public static void reverseString(String input) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch: input.toCharArray())
//            stack.push(ch);
//
//        System.out.println(stack);
//
//        StringBuilder a = new StringBuilder();
//        while (!stack.empty()) {
//            a.append(stack.pop());
//        }
//
//        System.out.println(a);
//
//        Stacks stacks = new Stacks();
//        boolean isBalanced = stacks.findBalancedString("{(ansdi oajf  })");
//        System.out.println(isBalanced);

        // Again Linked List training
        MyLinkedList  myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.addFirst(10);
        myLinkedList.add(2);
        myLinkedList.set(2, 55);

        myLinkedList.print();
    }
}
