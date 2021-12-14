package Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld obja= (HelloWorld) applicationContext.getBean("helloWorld");

        obja.setMessage("I'm Obj A");
        obja.getMessage();

        HelloWorld objB= (HelloWorld) applicationContext.getBean("helloWorld");
        objB.getMessage();
    }
}
