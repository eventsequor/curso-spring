package com.eder.dependency_injection_constructor;


public class DirectoryEmployee implements Employees {

    private final ReportCreation newReport;

    public DirectoryEmployee(ReportCreation newReport) {
        this.newReport = newReport;
    }

    @Override
    public String getTasks() {
        return "Manage the things of the company";
    }

    @Override
    public String getReport() {
        return "Report of director: " + newReport.getReport();
    }
}
