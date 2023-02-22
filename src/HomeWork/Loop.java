package HomeWork;




public class Loop {
    public static void main(String[] args) {

        int number = 1;

        while (number <= 100) {
            System.out.println(number);
            number++;

            while (number <= 15) {
                if (number % 2 != 0)
                    System.out.println(number);
                number++;

                while (number <= 50) {
                    System.out.println(number);
                    number += 5;
                }
            }
        }
    }
}




