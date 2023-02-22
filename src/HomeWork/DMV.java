package HomeWork;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("What's your age?");
        int age= input.nextInt();
        int age1=18;

        if(age1>18){
            System.out.println("Will issue a driver license");
        } else{
            System.out.println("We will offer to get a learners' permit");
        }
    }
}
