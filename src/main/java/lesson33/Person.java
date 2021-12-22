package lesson32;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Dog dog;

    public Person(Dog dog){
        System.out.println("Person created");
        this.dog=dog;
    }

    public void callYourPet(){
        System.out.println("Hello, my Dog!");
        dog.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName()) && Objects.equals(getDog(), person.getDog());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDog(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                '}';
    }
}
