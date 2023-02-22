package HomeWork;


import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int  a=scanner.nextInt();
        int  b= scanner.nextInt();
        System.out.println("Please enter operator +, -, *, / ");
        char operator=scanner.next().charAt(0);

        switch (operator){
            case '-':
                System.out.println(a-b);
                break;
            case '+':
                System.out.println(a+b);
                break;
            case'*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }


        }
    }


