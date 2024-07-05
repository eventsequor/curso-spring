package com.eder.bean_life_cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBeanLifeCycle.xml");
        System.out.println("Life cycle of bean");
        Employees maria = context.getBean("myDirector", Employees.class);
        System.out.println("Memory localization: " + maria);
        System.out.println(maria.getReport());

        context.close();
    }
}
