package com.eder.annotations;

import org.springframework.stereotype.Component;

@Component
public class SalesReportTrim3 implements SalesReport {
    @Override
    public String getSalesReport() {
        return "Sales report Trim 3";
    }
}
