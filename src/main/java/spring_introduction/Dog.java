package spring_introduction;

import org.springframework.stereotype.Component;

@Component("dog")

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){

        System.out.println("Vov vov");
    }
    public void init(){
        System.out.println("Class Dog: init method");
    }
    public void desrtoy(){
        System.out.println("Class Dog: destroy");
    }
}
