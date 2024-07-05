package com.eder.inversion_of_control;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployeesMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employees juan = context.getBean("myEmployee", Employees.class);
        System.out.println(juan.getTasks());
        context.close();
    }

    private void firstExample(){
        // Object creation

        BossEmployee bossEmployee = new BossEmployee();

        // Use of instances
        System.out.println(bossEmployee.getTasks());
    }
}
