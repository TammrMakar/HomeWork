package HomeWork;


import java.util.Scanner;

public class country {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country= scanner.next();

        switch (country) {
            case "Egypt":
            System.out.println("Arabic");
            break;
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
                System.out.println("Spanish");
                break;
            case "Germany":
                System.out.println("dutech");
                break;
        }


        }
    }


