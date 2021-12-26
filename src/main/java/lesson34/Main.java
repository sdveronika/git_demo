package lesson34;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet dog = context.getBean("dog", Pet.class);
//        System.out.println(dog);
//        Person person = context.getBean("person", Person.class);
//        System.out.println(person);
//
//        context.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        person.callPet();
        context.close();
    }
}
