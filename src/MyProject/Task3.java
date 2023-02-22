package MyProject;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // Create a 2D array of integer values. Print the sum of all numbers.

        int[][] numbers = {{1, 2, 3, 4}, {4, 5, 6, 7, 8}, {8, 9, 10, 11}};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers.length; j++) {
                sum = sum + numbers[i][j];
            }
        System.out.println(sum);
    }
        }
















