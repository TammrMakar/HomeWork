package HomeWork;


import java.util.Scanner;

public class season {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = scanner.next();

        if (month.equals("June") || (month.equals("July")) || (month.equals("August"))) {

            System.out.println("You were born in Summer");
        } else {
            System.out.println("You were born in winter");
        }
    }
}

