package MyProject;

public class Task10 {
    public static void main(String[] args) {

        //Maximum and minimum number in the array?

        int [] numbers={10,20,30,45,50};

        int max=numbers[0];
        int min=numbers[0];

        for (int i = 1; i < numbers.length; i++) {
                if (numbers[i]>max){
                     max=numbers[i];
                }
                if (numbers[i]<min)
                {min=numbers[i];
                }
            }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        }
    }

















