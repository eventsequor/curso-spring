package com.eder.dependency_injection_setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSetter.xml");
        System.out.println("I am a main from setter package");
        Employees juan = context.getBean("mySecretary", Employees.class);
        System.out.println(juan.getTasks());
        System.out.println(juan.getReport());
        context.close();
    }
}
