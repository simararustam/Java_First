public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + Math.round(circle.calculateArea()));

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Area of Rectangele: " + Math.round(rectangle.calculateArea()));
    }
}