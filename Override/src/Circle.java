public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        super.calculateArea();
        return Math.PI * radius * radius;
    }
}
