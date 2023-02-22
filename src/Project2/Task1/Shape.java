package Project2.Task1;

public interface Shape {

void calculateArea();
void calculatePerimeter();
}
class Circle implements Shape{

    double radius;

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea() {
        System.out.println(3.14*this.radius*this.radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*3.14*this.radius);
    }
}

class Square implements Shape {

    double side;

    Square(double side) {
        this.side = side;

    }

    @Override
    public void calculateArea() {
        System.out.println(this.side * this.side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(4 * this.side);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(5);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square=new Square(4);
        square.calculateArea();
        square.calculatePerimeter();
    }
}


