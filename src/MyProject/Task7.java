package MyProject;

public class Task7 {
    public static void main(String[] args) {

        // Write a java program to check whether a given number is prime or not?

        // prime number - a number that is divisible only by 1 and itself
        //example - 2,3,5,7,11,13

        int num = 13;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count==2){
        System.out.println("Prime");
    }else {
        System.out.println("Not prime");
    }
}}
















