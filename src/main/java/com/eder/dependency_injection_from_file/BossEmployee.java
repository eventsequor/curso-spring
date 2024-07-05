package com.eder.dependency_injection_from_file;


public class BossEmployee implements Employees {

    private ReportCreation newReport;

    public String getTasks() {
        return "I manage the people";
    }

    @Override
    public String getReport() {
        return "Report of Boss: " + newReport.getReport();
    }

    public void setNewReport(ReportCreation newReport) {
        this.newReport = newReport;
    }
}
