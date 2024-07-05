package com.eder.dependency_injection_from_file;

public class Report implements ReportCreation {

    @Override
    public String getReport() {
        return "This is the default report";
    }
}
