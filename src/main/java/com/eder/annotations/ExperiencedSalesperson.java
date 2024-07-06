package com.eder.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("ExperiencedSalesperson")
@Component
@Scope("prototype")
public class ExperiencedSalesperson implements Employee {

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
