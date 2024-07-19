package com.eder.annotations_without_xml;

import org.springframework.stereotype.Component;

@Component
public class SalesReportTrim2 implements SalesReport {
    @Override
    public String getSalesReport() {
        return "Sales report Trim 2";
    }
}
