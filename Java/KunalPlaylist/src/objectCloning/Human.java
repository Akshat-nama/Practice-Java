package objectCloning;

import java.util.Arrays;

public class Human {
    public int age;
    public int[] fun;

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", fun=" + Arrays.toString(fun) +
                '}';
    }

    public Human(int age, int[] fun) {
        this.age = age;
        this.fun = fun;
    }

    public Human(Human other) {
        this.age = other.age;
        this.fun = other.fun;
    }
}
