package HomeWork02082023;

public class CreditCard {

    int balance=3000;
    int interset=5;

    void calculateInterest(){
        System.out.println("Total balance "+balance*interset*2);
    }
}

class Visa extends CreditCard{

}

class Ax extends CreditCard{
    @Override
    void calculateInterest(){
        System.out.println("Total interset "+balance*interset*3);
    }
}

class CreditCardTester{
    public static void main(String[] args) {

        CreditCard cc=new CreditCard();
        cc.calculateInterest();
        Visa visa=new Visa();
        visa.calculateInterest();
        Ax ax=new Ax();
        ax.calculateInterest();
    }
}