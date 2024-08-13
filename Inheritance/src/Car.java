public class Car extends Vehicle{
    int numDoors;

    public Car(int numDoors, String make, String model) {
        super(make, model);
        this.numDoors = numDoors;
    }

    @Override
    public void DisplayAtr() {
        super.DisplayAtr();
        System.out.println("Number of Doors- " + numDoors);
    }
}

