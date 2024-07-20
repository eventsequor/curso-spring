package com.eder.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.eder.bean_annotation")
public class EmployeeConfiguration {
    // defined a bean to financial report of purchasing department
    @Bean
    public CreationFinancialReport creationFinancialReportPurchasingDepartment() { // this is the id of bean injected
        return new FinancialReportPurchasingDepartment();
    }

    // defined a bean to financial director
    @Bean
    public Employee financialDirector() {
        return new FinancialDirector(creationFinancialReportPurchasingDepartment());
    }

}
