package com.eder.dependency_injection_singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSingleton.xml");
        System.out.println("Singleton pattern");
        SecretaryEmployee maria = context.getBean("mySecretary", SecretaryEmployee.class);

        SecretaryEmployee pedro = context.getBean("mySecretary", SecretaryEmployee.class);

        System.out.println(maria);
        System.out.println(pedro);
        System.out.println(maria.equals(pedro) ? "They are the same object" : "They are not the same object");

        System.out.println("\nPrototype pattern");
        SecretaryEmployee maria2 = context.getBean("mySecretary2", SecretaryEmployee.class);

        SecretaryEmployee pedro2 = context.getBean("mySecretary2", SecretaryEmployee.class);

        System.out.println(maria2);
        System.out.println(pedro2);
        System.out.println(maria2.equals(pedro2) ? "They are the same object" : "They are not the same object");
        context.close();
    }
}
