package HomeWork;

import java.util.Scanner;

public class personheights {
    public static void main(String[] args) {

        Scanner heights=new Scanner(System.in);
        System.out.println("Enter your Personal Height");
        int height= heights.nextInt();

        if(height < 60) {
            System.out.println("Short");
        }else{
            if(height==60|| height==72){
                System.out.println("Medinum");
            }else {
                if (height>72){
                    System.out.println("Tall");
                }
            }
        }

}}
