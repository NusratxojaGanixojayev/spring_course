package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(Myconfig.class);

    Library library = context.getBean("libraryBean",Library.class);




}
