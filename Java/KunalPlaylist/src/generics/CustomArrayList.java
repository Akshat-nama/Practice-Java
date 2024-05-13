package generics;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private int size = 0;
    public static int DYNAMIC_SIZE = 10;


    CustomArrayList() {
        this.data = new int[DYNAMIC_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            expandSize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        return data[--size];
    }

    public int size() {
        return size;
    }

    private void expandSize() {
        int[] newData = new int[size * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void set(int key, int value) {
        this.data[key] = value;
    }

}
