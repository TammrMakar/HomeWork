package HomeWork01182023;

import java.util.Arrays;

public class Cars {
    public static void main(String[] args) {

        //2) Create 2D array of cars : american, german, korean, italian.
           // Then retrieve all values from that array using 2 different loops

  String[][]cars={{"American","Germen","Korean","Italian"},{"Volvo","BMW","Kia","Ferrari"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {


                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(cars[0]));
        System.out.println(Arrays.toString(cars[1]));
    }
}
