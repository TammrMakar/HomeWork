package MyProject;

public class Task6 {
    public static void main(String[] args) {

        // Write a program to swap 2 numbers without a temporary variable?

    int a=20;
    int b=30;

        System.out.println("Before Swap");
        System.out.println("First value "+a);
        System.out.println("Second value "+b);

        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println("after Swap");
        System.out.println("First value "+a);
        System.out.println("Second value "+b);

    }
}
















