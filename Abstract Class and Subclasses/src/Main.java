public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println("Area of circle = " + Math.round(circle.calculateArea()));

        Square square = new Square(4);
        System.out.println("Area of square = " + square.calculateArea());

        ResizableRectangle resize = new ResizableRectangle(4);
        System.out.println("Resize = " + resize.resize(5));
    }
}