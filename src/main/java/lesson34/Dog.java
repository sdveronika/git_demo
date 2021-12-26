package lesson34;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton")
public class Dog implements Pet{

    @Value("Jack")
    private String name;

    public Dog(){
        System.out.println("Dog created");
    }

    @Override
    public void say() {
        System.out.println("Gaf-Gaf");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
