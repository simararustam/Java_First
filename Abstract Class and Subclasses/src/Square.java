public class Square extends Shape{
    int a;

    public Square(int b) {
        this.a  = b;
    }

    public double calculateArea() {
        return a * a;
    }
}
