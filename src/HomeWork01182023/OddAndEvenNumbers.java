package HomeWork01182023;

public class OddAndEvenNumbers {
    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will identify/print the even numbers only.

        int[][]OddAndEvenNumbers={{1,2,3,4,5},
                                  {6,7,8,9,10},
                                  {11,12,13,14,15}};

        for (int i = 0; i < OddAndEvenNumbers.length; i++) {
            for (int j = 0; j < OddAndEvenNumbers[i].length ; j++) {
                if (OddAndEvenNumbers[i][j]%2==0){
                    System.out.print(OddAndEvenNumbers[i][j]+" ");
                }

            }
            System.out.println();
        }
    }
}
