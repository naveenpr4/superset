public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        Shape shape2 = ShapeFactory.getShape("square");

        shape1.draw();  // Output: Drawing a Circle
        shape2.draw();  // Output: Drawing a Square
    }
}