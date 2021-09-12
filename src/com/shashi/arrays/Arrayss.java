package com.shashi.arrays;

public class Arrayss extends CustomArray {
    int[] numbers = {1, 2, 3, 4, 5};

    public Arrayss(int length) {
        super(length);
//        System.out.println(Arrays.toString(numbers));
    }

    // insert array using its methods
    public void insertAndPrint() {

    }
}

class CustomArray {
    private int[] items;
    private int count = 0;

    public CustomArray(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < items.length; i++ )
            if (items[i] == item)
                return i;
        return -1;
    }
}