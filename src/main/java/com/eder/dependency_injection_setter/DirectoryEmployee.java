package com.eder.dependency_injection_setter;


public class DirectoryEmployee implements Employees {

    private ReportCreation newReport;

    @Override
    public String getTasks() {
        return "Manage the things of the company";
    }

    @Override
    public String getReport() {
        return "Report of director: " + newReport.getReport();
    }

    public void setNewReport(ReportCreation newReport) {
        this.newReport = newReport;
    }
}
