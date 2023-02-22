package HomeWork;


import java.util.Scanner;

public class distinctNumbers2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        double number = scanner.nextInt();

        double number1 = 100;
        double number2 = 200;
        double number3 = 300;

        if (100 > 200 && 100 > 300) {
            if(200 > 100 && 200 > 300) {
                if (300 > 100 && 300 > 200) {
                }
                System.out.println("100 is the lergest number");
            }
            System.out.println("200 is the lergest number");
        }
            System.out.println("300 is the lergest number");
        }
    }


