package generics;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayGenList<T> {

    private Object[] data;
    private int size = 0;
    public static int DYNAMIC_SIZE = 10;


    CustomArrayGenList() {
        this.data = new Object[DYNAMIC_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            expandSize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        return (T) (data[--size]);
    }

    public int size() {
        return size;
    }

    private void expandSize() {
        Object[] newData = new Object[size * 2];
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

    public void set(int key, T value) {
        this.data[key] = value;
    }

}
