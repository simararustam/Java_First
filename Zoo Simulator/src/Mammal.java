public class Mammal extends Animal{
    protected String furColor;

    public Mammal(String name, int age, String sound, String furColor) {
        super(name, age, sound);
        this.furColor = furColor;
    }

    public void giveBirth() {
        System.out.println(name + "birth with " + furColor + " fur");
    }
}
