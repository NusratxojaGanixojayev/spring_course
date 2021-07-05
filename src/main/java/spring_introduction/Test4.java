package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationCon2.xml");

//        Dog mydDog = context.getBean("myPet",Dog.class);
//        Dog yourDog = context.getBean("myPet",Dog.class);
//
//
//        System.out.println("Ozgaruchci bitta obyektga yonalyaptimi" +  (mydDog==yourDog));
//        System.out.println(mydDog);
//
        context.close();

    }
}
