package Project2.Task3;

public class Car {

    int carPrice;
    String color;

    Car(int carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Car {

    double length;

    Sedan(int carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return carPrice * 0.95;
        }
        return carPrice * 0.9;
    }
}

class Truck extends Car {

    double weight;

    Truck(int carPice, String color, double weight) {
        super(carPice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice * 0.9;
        }
        return carPrice * 0.8;
    }

    public static void main(String[] args) {
        Sedan sedan=new Sedan(15000,"red",30);
        System.out.println(sedan.calculateSalePrice());
        Truck truck=new Truck(30000,"Blue",350.00);
        System.out.println(truck.calculateSalePrice());

    }
}
