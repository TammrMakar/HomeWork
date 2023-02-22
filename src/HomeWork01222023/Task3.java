package HomeWork01222023;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //2)	Write a program that reads two people's first names and if they expecting boy or girl?
        //
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
        //
        //Example Output: Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAIEL

        Scanner sacnner = new Scanner(System.in);
        System.out.println("Please enter Mom’s first name");
        String momname = sacnner.nextLine();
        System.out.println("Please enter Dad’s first name");
        String dadname = sacnner.nextLine();
        System.out.println("What are you expecting boy or girl");
        String gender = sacnner.nextLine();

        String babyboy = dadname.substring(0, 3) + momname.substring(2, 4);
        String babygirl = momname.substring(0, 2) + dadname.substring(3, 6);

        babyboy = babyboy.toUpperCase();
        babygirl = babygirl.toUpperCase();

        if (gender.equalsIgnoreCase("Boy")) {
            System.out.println(babyboy);
        }
        if (gender.equalsIgnoreCase("Girl")) {
            System.out.println(babygirl);
        }
    }
}
