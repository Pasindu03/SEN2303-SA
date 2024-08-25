package Shapes;

public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.getShape("SQUARE");
        if (square != null){
            System.out.println("square");
            square.draw();
            System.out.println();9
        }

        Shape circle = shapeFactory.getShape("CIRCLE");
        if (circle != null){
            System.out.println("circle");
            circle.draw();
            System.out.println();
        }

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        if (rectangle != null){
            System.out.println("square");
            rectangle.draw();
            System.out.println();
        }

        Shape invalidShape = shapeFactory.getShape("PENTAGON");
        if (invalidShape != null) {
            invalidShape.draw();
        }

    }
}
