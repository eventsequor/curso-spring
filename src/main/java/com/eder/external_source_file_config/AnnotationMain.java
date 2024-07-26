package com.eder.external_source_file_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {
        singleton();
    }

    public static void singleton() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);

        System.out.println("Bean number one");
        Employee employee = context.getBean("financialDirector", Employee.class);

        System.out.println(employee.getTasks());
        System.out.println(employee.getReport());

        System.out.println("\nBean number two");
        FinancialDirector financialDirector = context.getBean("financialDirector", FinancialDirector.class);
        System.out.println(financialDirector.getTasks());
        System.out.println(financialDirector.getReport());
        System.out.println("Email: " + financialDirector.getEmail());
        System.out.println("Company name: " + financialDirector.getCompanyName());

        context.close();
    }

}
