import com.enigma.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle1 = new Rectangle(10, 8);
//        Rectangle rectangle2 = new Rectangle(9, 8);
//        Rectangle rectangle3 = new Rectangle(5, 4);
//
//        RectangleCalculator rectangleCalculator = new RectangleCalculator();
//        rectangleCalculator.addRectangle(rectangle1);
//        rectangleCalculator.addRectangle(rectangle2);
//        rectangleCalculator.addRectangle(rectangle3);
//
//        System.out.println(rectangleCalculator.sum());
//
//        System.out.println("==========================");
//
//        Block block = new Block(4, 5,2);
//        System.out.println(block.getVolume());
//
//
//        System.out.println("==========================");

        Shape circle= new Circle(5.0);
        Rectangle rectangle= new Rectangle(7.0,3.0);
        Triangle bermuda= new Triangle(8.0, 5.0);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        shapeCalculator.addShape(circle);
        shapeCalculator.addShape(rectangle);
        shapeCalculator.addShape(bermuda);
        System.out.println(shapeCalculator.sum());




    }
}
