package com.eder.external_source_file_config;

import org.springframework.beans.factory.annotation.Value;

public class FinancialDirector implements Employee {

    private CreationFinancialReport creationFinancialReport;

    @Value("${email}")
    private String email;

    @Value("${companyName}")
    private String companyName;

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

    public String getEmail() {
        return email;
    }

    public String getCompanyName() {
        return companyName;
    }
}
