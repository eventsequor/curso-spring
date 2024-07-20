package com.eder.bean_annotation;

public class FinancialReportPurchasingDepartment implements CreationFinancialReport {
    @Override
    public String getFinancialReport() {
        return "Financial report from the financial department";
    }
}
