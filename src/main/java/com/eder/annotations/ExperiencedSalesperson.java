package com.eder.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("ExperiencedSalesperson")
@Component
public class ExperiencedSalesperson implements Employee {

    private final CreationFinancialReport financialReport;

    @Autowired
    public ExperiencedSalesperson(CreationFinancialReport financialReport) {
        this.financialReport = financialReport;
    }

    @Override
    public String getTasks() {
        return "Sell, sell and sell more";
    }

    @Override
    public String getReport() {
        //return "This is a report generate by the salesperson";
        return financialReport.getFinancialReport();
    }
}
