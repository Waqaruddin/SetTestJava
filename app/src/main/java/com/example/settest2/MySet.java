package com.example.settest2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MySet {

    int[] data = {};

    public boolean add(int i) {

        for (int num : data) {
            if (i == num) {
                return false;
            }
        }
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = i;
        return true;
    }

    public boolean isEmpty() {
        return data.length == 0;
    }

    public int size() {
        return data.length;
    }

    public boolean contains(int i) {

        for (int num : data) {
            if (num == i) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(int num) {
        if (data == null || num < 0 || num >= data.length) {
            return false;
        }
        int[] newArr = new int[data.length - 1];
        for (int i = 0, k = 0; i < data.length; i++) {
            if (i == num) {
                continue;
            }
            newArr[k++] = data[i];
        }
        return true;
    }
}
