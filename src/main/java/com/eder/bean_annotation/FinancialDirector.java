package com.eder.bean_annotation;

public class FinancialDirector implements Employee {

    private CreationFinancialReport creationFinancialReport;

    public FinancialDirector(CreationFinancialReport creationFinancialReport) {
        this.creationFinancialReport = creationFinancialReport;
    }

    @Override
    public String getTasks() {
        return "Management and direction of financial operations in the company";
    }

    @Override
    public String getReport() {
        return creationFinancialReport.getFinancialReport();
    }

    @Override
    public String getSalesReport() {
        return null;
    }
}
