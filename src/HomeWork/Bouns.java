package HomeWork;

import java.util.Scanner;

public class Bouns {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("How many years your worked");
        int years = input.nextInt();

        if (years >= 5) {
            System.out.println("Your eligible for the bonus");
            System.out.println("Whats your salary");
        } else {
            System.out.println("Your are not ");
        }
            int salary = input.nextInt();

            if (salary > 50000) {
                System.out.println("Your bonus 5000");
            } else {
                System.out.println("your bonus 3000");
            }
        }
    }


