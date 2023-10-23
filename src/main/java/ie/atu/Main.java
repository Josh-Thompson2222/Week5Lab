package ie.atu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person student1 = new Person("Josh", "Thompson", 20);
        System.out.println("Details are " + student1.getFirstName() + " " + student1.getLastName() + " " + student1.getAge());
    }
}