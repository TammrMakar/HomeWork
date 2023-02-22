package HomeWork01182023;

public class BulldogTester {
    public static void main(String[] args) {


        Bulldog bulldog1=new Bulldog();
        bulldog1.name="cleo";
        bulldog1.age=5;
        bulldog1.color="Brown";
        bulldog1.friendly=true;
        bulldog1.eat();
        bulldog1.easygoing();

        System.out.println(bulldog1.name);
        System.out.println(bulldog1.age);
        System.out.println(bulldog1.color);


    }
}
