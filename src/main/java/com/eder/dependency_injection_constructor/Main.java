package com.eder.dependency_injection_constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextConstructor.xml");

        Employees juan = context.getBean("myEmployee", Employees.class);
        System.out.println(juan.getTasks());
        System.out.println(juan.getReport());
        context.close();
    }
}
