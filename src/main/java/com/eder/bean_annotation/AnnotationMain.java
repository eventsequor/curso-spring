package com.eder.bean_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {
        singleton();
    }

    public static void singleton() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);

        Employee employee = context.getBean("financialDirector", Employee.class);

        System.out.println(employee.getTasks());
        System.out.println(employee.getReport());

        context.close();
    }

}
