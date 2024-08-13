public class Bird extends Animal{
    protected int wingSpan;

    public Bird(String name, int age, String sound, int wingSpan) {
        super(name, age, sound);
        this.wingSpan = wingSpan;
    }

    public void fly() {
        System.out.println(name + "flying with " + wingSpan + " wing span");
    }
}
