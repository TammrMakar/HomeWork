package HomeWork;

import java.util.Scanner;

public class CityAndTemperature {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("What's your city");
        String name= input.nextLine();
        System.out.println("What's the temp in your city in Fahr");
        int temp= input.nextInt();
        int temp1=temp*5/9;

        if (temp==60) {
            System.out.println("The temperature is the city is " + temp1+" in Celsius");
        }
    }
}
