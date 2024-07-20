package com.eder.annotations_without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {
        singleton();
    }

    public static void singleton() {
        System.out.println("\n===== Singleton pattern with spring framework ======");
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

        //Read the configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);

        Employee employee = context.getBean("experiencedSalesperson", Employee.class);
        Employee employee2 = context.getBean("experiencedSalesperson", Employee.class);
        System.out.println();
        System.out.println(employee.equals(employee2) ? "They are the same object" : "The objects are not the same");

        context.close();
    }

}
