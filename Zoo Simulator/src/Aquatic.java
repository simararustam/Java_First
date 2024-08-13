public class Aquatic extends Animal{
    protected int swimmingDepth;

    public Aquatic(String name, int age, String sound, int swimmingDepth) {
        super(name, age, sound);
        this.swimmingDepth = swimmingDepth;
    }

    public void swim() {
        System.out.println(name + "can swim till " + swimmingDepth);
    }
}
