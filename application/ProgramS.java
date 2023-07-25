package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class ProgramS {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + String.format("%.2f",totalArea(myShapes)));


        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(3.0));
        myCircle.add(new Circle(2.0));

        System.out.println("Circle total area: " + String.format("%.2f",totalArea(myCircle)));
    }
    public static double totalArea(List<? extends Shape> list){ //in this way you are saying that it can implement shape and subtype of shape
        double sum = 0.0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
