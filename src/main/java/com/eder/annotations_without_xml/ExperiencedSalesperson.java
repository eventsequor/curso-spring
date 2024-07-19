package com.eder.annotations_without_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("ExperiencedSalesperson")
@Component
//@Scope("prototype") // The annotations PostConstruct and PreDestroy is mandatory to work with singleton
// that is why we have this commented

public class ExperiencedSalesperson implements Employee {

    // Code execution after to build the bean
    @PostConstruct
    public void executeAfterCreateTheBean() {
        System.out.println("Executed after to create the build");
    }

    // Code execution after turn off the bean
    @PreDestroy
    public void executeBeforeDestroyTheBean() {
        System.out.println("Execution before to destroy the bean");
    }

    private CreationFinancialReport financialReport;
    //@Autowired //This is useful only when we have only one implementation.
    // however if we have the qualifier annotation then we can choose one specific class
    @Autowired
    @Qualifier("salesReportTrim2")
    private SalesReport salesReport;

    @Override
    public String getTasks() {
        return "Sell, sell and sell more";
    }

    @Override
    public String getReport() {
        //return "This is a report generate by the salesperson";
        return financialReport.getFinancialReport();
    }

    @Override
    public String getSalesReport() {
        return salesReport.getSalesReport();
    }

    @Autowired
    public void setFinancialReport(CreationFinancialReport financialReport) {
        this.financialReport = financialReport;
    }

    /*@Autowired
    public void setSalesReport(SalesReport salesReport) {
        this.salesReport = salesReport;
    }*/
}
