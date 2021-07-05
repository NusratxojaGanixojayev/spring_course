package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")

public class MyConfig {
    @Bean
    @Scope
    public Pet catBean(){
        return new  Cat();

    }

    @Bean
    public Person personBean(){
        return new Person(catBean());

    }



}
