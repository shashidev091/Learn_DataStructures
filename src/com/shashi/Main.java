package com.shashi;

import com.shashi.arrays.Arrayss;
import com.shashi.linkedList.LinkedList;

import java.util.ArrayList;

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

        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);

        System.out.println(list.contains(3));
        System.out.println(list.size());
    }
}
