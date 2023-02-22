package HomeWork01182023;

import java.util.Arrays;

public class Grocery {
    public static void main(String[] args) {

        //4)	Using 2D array create a grocery list. Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops

        String[][]grocerylist={{"Veggies","fruits","Dairy","Sweets"},
                                {"GreenBeans","Apple","Milk","choc cake"}};


        for (int i = 0; i < grocerylist.length ; i++) {
            for (int j = 0; j < grocerylist[i].length; j++) {
                System.out.print(grocerylist[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(grocerylist[1]));
        System.out.println(Arrays.toString(grocerylist[0]));
    }
}
