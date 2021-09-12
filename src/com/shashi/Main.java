package com.shashi;

import com.arrays.Arrayss;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Arrayss array = new Arrayss(4);
        array.print();

        array.insert(1);
        array.insert(5);
        array.insert(2);

        array.print();
        System.out.println();
        array.removeAt(2);
        array.print();
        int a = array.indexOf(5);
        System.out.println(a);


    }
}
