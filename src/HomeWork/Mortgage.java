package HomeWork;

public class Mortgage {
    public static void main(String[] args) {
        double rate=4.5;
        int house=200000;


        if(rate<6.5){
            System.out.println("User will not buy a house");
        }
        if(house<3000000){
            System.out.println("User will take a loan");
        }else {
            System.out.println("User will pay cash");
        }
    }
}
