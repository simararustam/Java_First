public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "Toyota", "Corolla");
        System.out.println("Car details:");
        car.DisplayAtr();

        System.out.println("------------------");
        System.out.println("Bike details: ");
        Bike bike = new Bike(2, "Yamaha", "Mt-07");
        bike.DisplayAtr();
    }
}
