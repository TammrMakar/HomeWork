package HomeWork;


import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Grade");
        String grade= scanner.next();

        switch(grade){
            case "A":
                System.out.println("Exellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");


        }


        }
    }


