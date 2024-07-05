package com.eder.dependency_injection_fields;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextFields.xml");
        System.out.println("I am a main from fields of beans");
        SecretaryEmployee maria = context.getBean("mySecretary", SecretaryEmployee.class);
        System.out.println(maria.getTasks());
        System.out.println(maria.getReport());
        System.out.println("Email:" + maria.getEmail());
        System.out.println("Company name: " + maria.getCompanyName());
        context.close();
    }
}
