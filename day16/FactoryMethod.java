package classroom.day16;

interface Shape{
    String describe();
}
class Circle implements Shape{
    int radius;

    @Override
    public String describe() {
        return "Circle is created.";
    }
}
class Square implements Shape{
    int side;

    @Override
    public String describe() {
        return "Square is created.";
    }
}
abstract class ShapeFactory{
    abstract Shape createShape();
    void getDescription(){
        Shape shape=createShape();
        System.out.println(shape.describe());
    }
}
class CircleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Circle();
    }
}
class SquareFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Square();
    }
}
public class FactoryMethod {
    public static void main(String[] args) {
        ShapeFactory circleFactory=new CircleFactory();
        circleFactory.getDescription();
        ShapeFactory squareFactory=new SquareFactory();
        squareFactory.getDescription();
    }
}
