package com.eder.external_source_file_config;

public class FinancialReportPurchasingDepartment implements CreationFinancialReport {
    @Override
    public String getFinancialReport() {
        return "Financial report from the financial department";
    }
}
