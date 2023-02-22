package MyProject;

public class Task5 {
    public static void main(String[] args) {

        // Create a 2D array of integers.
        // Develop a program which will calculate the sum of even and odd numbers for that array.

        int[][] number = {{1, 3, 5, 7, 9, 11, 13, 15, 17, 19}, {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}};

        int evensum = 0;
        int oddsum = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] % 2 == 0) {
                    evensum += number[i][j];
                } else {
                    oddsum += number[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers"+ evensum);
        System.out.println("Sum of even numbers"+oddsum);
    }
}
















