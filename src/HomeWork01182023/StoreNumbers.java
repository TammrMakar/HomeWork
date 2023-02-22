package HomeWork01182023;

public class StoreNumbers {
    public static void main(String[] args) {


        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int[][] storenumbers = {{1, 2, 3, 4, 5},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14}};

        int sum = 0;
        for (int i = 1; i < storenumbers.length; i++) {
            for (int j = 0; j < storenumbers[i].length; j++) {
                sum += storenumbers[i][j];
            }

            }
            System.out.println(sum);
            System.out.print("sum "+sum+" ");
        }

    }
