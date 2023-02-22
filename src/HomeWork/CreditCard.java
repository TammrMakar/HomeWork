package HomeWork;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("You have a credit card ");
        boolean card = input.nextBoolean();
        System.out.println("Whats balance on the card");
        int amount = input.nextInt();
        int balance = 1000;

        if (balance > 500) {
            System.out.println("Pay off immediately");
        } else {
            System.out.println("you can spend more");
        }
    }
}
