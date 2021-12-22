package lesson32;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet=context.getBean("pet", Pet.class);
        System.out.println(pet);

        Person person=context.getBean("Person", Person.class);
        System.out.println(person);

        person.callYourPet();
    }

}
