public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Simara");
        person.setAge(20);

        System.out.println(person.getName() + " " + person.getAge());
    }
}
