package com.eder.dependency_injection_constructor;


public class BossEmployee implements Employees {

    private final ReportCreation newReport;

    public BossEmployee(ReportCreation newReport) {
        this.newReport = newReport;
    }

    public String getTasks() {
        return "I manage the people";
    }

    @Override
    public String getReport() {
        return "Report of Boss: " + newReport.getReport();
    }
}
