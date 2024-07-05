package com.eder.dependency_injection_constructor;


public class SecretaryEmployee implements Employees {

    private final ReportCreation newReport;

    public SecretaryEmployee(ReportCreation newReport) {
        this.newReport = newReport;
    }

    @Override
    public String getTasks() {
        return "I am a secretary";
    }

    @Override
    public String getReport() {
        return "Report of Secretary: " + newReport.getReport();
    }
}
