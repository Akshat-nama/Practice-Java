package objectCloning;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        Human akshat = new Human(24, a);
        System.out.println("I am Akshat"+akshat.toString());

        Human twin = new Human(akshat);
        System.out.println("I am twin" + twin.toString());

        twin.fun[0] = 100;
        twin.age = 50;
        System.out.println("I am twin " + twin.toString());
        System.out.println("I am Akshat "+akshat.toString());





    }
}
