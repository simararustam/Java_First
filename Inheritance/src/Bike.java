public class Bike extends Vehicle{
    int numWheels;

    public Bike(int numWheels, String make, String model) {
        super(make, model);
        this.numWheels = numWheels;
    }

    @Override
    public void DisplayAtr() {
        super.DisplayAtr();
        System.out.println("Number of Wheels- " + numWheels);
    }
}
