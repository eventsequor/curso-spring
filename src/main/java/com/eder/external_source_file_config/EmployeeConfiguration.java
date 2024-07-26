package com.eder.external_source_file_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.eder.external_source_file_config")
@PropertySource("classpath:configuration_company.properties")
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
