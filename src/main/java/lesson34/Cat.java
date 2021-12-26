package lesson34;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton")
public class Cat implements Pet{

    @Value("Kitty")
    private String name;

    public Cat(){
        System.out.println("Cat created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
