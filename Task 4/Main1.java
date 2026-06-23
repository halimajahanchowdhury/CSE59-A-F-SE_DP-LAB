public class Main1 {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(5, 4),
                new Circle(3)
        };
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area = " + calculator.calculatorTotalArea(shapes));
    }
}


interface Shape {
    double calculatorArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    @Override
    public double calculatorArea() {
        return length * width;
    }
}


class Circle implements Shape {
    public double radius;

    Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double calculatorArea() {
        return Math.PI * radius * radius;
    }
    
}
class AreaCalculator {

    public double calculatorTotalArea(Shape[] shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculatorArea();
        }
        return totalArea;

    }
}

