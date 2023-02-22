package HomeWork;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("What the amount of loan you need");
        int amount=input.nextInt();
        int amount1=200000;

     if(amount<=200000){
         System.out.println("we will lend the money");
     }else {
         System.out.println("We will reject the customer");
     }
    }
}
