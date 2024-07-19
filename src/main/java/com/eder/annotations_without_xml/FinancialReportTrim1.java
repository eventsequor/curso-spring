package com.eder.annotations_without_xml;

import org.springframework.stereotype.Component;

@Component
public class FinancialReportTrim1 implements CreationFinancialReport {
    @Override
    public String getFinancialReport() {
        return "Presentation of financial report quarter 1";
    }
}
