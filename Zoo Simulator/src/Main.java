public class Main {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Lion", 5, "Roar", "Golden");
        Bird eagle = new Bird("Eagle", 3, "Screech", 2);
        Aquatic dolphin = new Aquatic("Dolphin", 8, "Click", 50);

        lion.giveBirth();

        eagle.fly();

        dolphin.swim();
    }
}