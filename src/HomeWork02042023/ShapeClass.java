package HomeWork02042023;

public class ShapeClass {

    double radius;
    double dia;
    double area;

    ShapeClass(double radius,double dia,double area){
        this.radius=radius;
        this.dia=dia;
        this.area=area;

    }
    void printInfo(){
        System.out.println("the shape of the radius "+radius);
    }
}

class Circle extends ShapeClass {

    float circumference;

    Circle(double radius, double dia, double area, float circumference) {

        super(radius, dia, area);
        this.circumference = circumference;

    }

    void displayCircle() {
        System.out.println("The result of method to calculate the area of circle is "+dia+circumference+area);

    }

    public static void main(String[] args) {

        Circle circle = new Circle(15, 55, 3.14f, 100);
        circle.displayCircle();
        circle.printInfo();

    }
}



