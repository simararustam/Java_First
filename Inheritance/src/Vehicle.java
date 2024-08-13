public class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void DisplayAtr() {
        System.out.println("Make- " + make);
        System.out.println("Model- " + model);
    }
}

