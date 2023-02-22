package HomeWork;

public class ArrayTask5 {
    public static void main(String[] args) {

        //Create an array of size 5 on integers and calculate the sum of all elements in an array.

        int []sizes={1,2,3,4,5};

        int sum=0;
        for (int i = 0; i < sizes.length; i++) {
            sum=sum+sizes[i];
        }
        System.out.println(sum);
        }
    }

