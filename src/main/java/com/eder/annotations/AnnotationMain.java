package com.eder.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

        Employee employee =  context.getBean("experiencedSalesperson", Employee.class);
        System.out.println(employee.getTasks());
        System.out.println(employee.getReport());

        context.close();
    }
}
