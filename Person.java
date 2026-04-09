public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 30);
        Person person2 = new Person("Jane", 25);
        System.out.println("Person 1: " + person.name + ", Age: " + person.age);
        System.out.println("Person 2: " + person2.name + ", Age: " + person2.age);
    }
}