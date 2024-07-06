package com.eder.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {
        initial_concepts();
        singleton();
    }

    public static void singleton() {
        System.out.println("\n===== Singleton pattern with spring framework ======");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

        Employee employee = context.getBean("experiencedSalesperson", Employee.class);
        Employee employee2 = context.getBean("experiencedSalesperson", Employee.class);
        System.out.println();
        System.out.println(employee.equals(employee2) ? "They are the same object" : "The objects are not the same");

        context.close();
    }

    public static void initial_concepts() {
        System.out.println("===== Normal way to use the annotations ======");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

        Employee employee = context.getBean("experiencedSalesperson", Employee.class);
        System.out.println(employee.getTasks());
        System.out.println(employee.getReport());
        System.out.println(employee.getSalesReport());

        context.close();
    }
}
