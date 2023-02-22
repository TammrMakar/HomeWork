package HomeWork;

import java.util.Scanner;

public class scores {
    public static void main(String[] args) {

     Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your quiz score ");
        int quiz= scanner.nextInt();
        System.out.println("Please enter your midterm score");
        int midterm= scanner.nextInt();
        System.out.println("Please enter your final score");
        int finalscore= scanner.nextInt();

        if (quiz+midterm+finalscore>=90){
            System.out.println("grade A");
        }else{
            if (quiz+midterm+finalscore >= 70 && quiz+midterm+finalscore <90){
                System.out.println("grade B");
            }else {
                if (quiz+midterm+finalscore>50 && quiz+midterm+finalscore <70 ){
                    System.out.println("grade C");
                }else {
                    if (quiz+midterm+finalscore<50 ){
                        System.out.println("grade F");
                    }
                }
            }
        }


            }
        }



