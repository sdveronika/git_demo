package lesson32;

import java.util.Objects;

public class Dog implements Pet{
    private String name;
    private int age;

    public Dog() {
        System.out.println("Dog created");
    }

    @Override
    public void say() {
        System.out.println("Gaf-gaf");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return getAge() == dog.getAge() && Objects.equals(getName(), dog.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
