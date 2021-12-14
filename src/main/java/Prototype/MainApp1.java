package Prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld1 objA= (HelloWorld1) applicationContext.getBean("helloWorld1");

        objA.setMessage("I'm Obj A");
        objA.getMessage();

        HelloWorld1 objB= (HelloWorld1) applicationContext.getBean("helloWorld1");
        objB.getMessage();
    }
}
