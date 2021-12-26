package lesson34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Objects;

//@Component
//@Scope("prototype")
public class Person {

    @Value("${person.name}")
    private String name;
    @Value("21")
    private int age;
//    @Autowired
//    @Qualifier("cat")
    private Pet pet;

    public Person(){
        System.out.println("Person created");
    }
    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Hello my pet");
        pet.say();
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName()) && Objects.equals(getPet(), person.getPet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getPet());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("Init method");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Destroy method");
    }
}
