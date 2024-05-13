package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions{
    public static void main(String[] args) {
//        ArrayList<Integer> arr= new ArrayList<>();
//        arr.add(5);
//        arr.add(3);
        //arr.add(4);

        //Lambda Functions are one line functions which do not require the name

       // arr.forEach((item) -> System.out.println(item*2));

//        Consumer<Integer> fun  = (item) -> System.out.println(item*2);
//        arr.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5,3,sum));
        System.out.println(myCalculator.operate(5,3,prod));

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a, int b);
}
