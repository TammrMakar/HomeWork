package MyProject;

public class Task4 {
    public static void main(String[] args) {

        // Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.


        int[][] allnumbers = {{1, 3, 5, 7, 9, 11, 13, 15, 17, 19}, {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}};

        for (int i = 0; i < allnumbers.length; i++) {
            for (int j = 0; j < allnumbers[i].length; j++) {
                if (allnumbers[i][j] % 2 == 0) {
                System.out.print(allnumbers[i][j] + " ");
            }
        }
    }
}}
















