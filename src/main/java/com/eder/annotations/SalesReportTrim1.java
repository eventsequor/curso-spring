package com.eder.annotations;

import org.springframework.stereotype.Component;

@Component
public class SalesReportTrim1 implements SalesReport {

    public String getSalesReport() {
        return "Sales report Trim one";
    }
}
