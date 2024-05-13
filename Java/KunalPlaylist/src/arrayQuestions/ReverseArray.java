package arrayQuestions;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

//        System.out.println("A         Kunal     Kushwaha  ".strip());
//        System.out.println("A         Kunal     Kushwaha  ".trim());


        reverseArray(arr);
//        char c = 'q';
//       PrintStream ps = new PrintStream();
//       ps.println(Arrays.toString(arr));

        byte a =78;
        byte b = 50;
        byte c = 100;
        byte d = 126 +1;

        System.out.println(d);


//        System.out.println(a==b);

    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(end>=start) {
            swapArray(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swapArray(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

    }


}

