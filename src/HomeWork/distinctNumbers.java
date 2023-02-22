package HomeWork;


import java.util.Scanner;

public class distinctNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        double number = scanner.nextInt();

        double number1 = 45;
        double number2 = 66;
        double number3 = 98;

        if (45 > 66 && 45 > 98) {
            System.out.println("45 is the lergest number");
        } else if(66 > 45 && 66 > 98){
            System.out.println("66 is the lergest number");
        }else {
            if (98> 45 && 98 > 45);
            System.out.println("98 is the lergest number");
        }
    }
}

