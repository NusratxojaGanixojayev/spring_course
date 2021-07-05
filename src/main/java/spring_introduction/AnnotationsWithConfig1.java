package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsWithConfig1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationCon3.xml");


        Person person= context.getBean("personBean",Person.class);
        person.callYourPet();

//        Cat myCat = context.getBean("catBean",Cat.class);
//        myCat.say();

        context.close();

    }
}
