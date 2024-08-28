public class ShapeCalculator {
//    Area for circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

//    Area fo+r Rectangle
    public double area(double width, double legth) {
        return width * legth;
    }

//    Area for triangle
    public double area(double a, double b, boolean isTriangle) {
        if ( isTriangle) {
            return a * b * 0.5;
        }
        else{
            return -1;
        }
    }
}
