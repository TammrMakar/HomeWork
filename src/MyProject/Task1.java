package MyProject;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Using Scanner create an array of integer values.
        // After the array is created, calculate the sum of all stored elements in that array.
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int[] numbers1 = new int[5];

        numbers1[0] = 88;
        numbers1[1] = 99;
        numbers1[2] = 55;
        numbers1[3] = 66;
        numbers1[4] = 77;
        numbers1[5] = 44;

        int sum=0;
        for (int i = 0; i <numbers1.length; i++) {
            sum=sum+numbers1[i];
        }
        System.out.println(sum);
    }
}











