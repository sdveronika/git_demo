package lesson34;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("lesson34")
@PropertySource("myApplication.properties")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet dog(){
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public Person person(){
        return new Person(dog());
    }
}
