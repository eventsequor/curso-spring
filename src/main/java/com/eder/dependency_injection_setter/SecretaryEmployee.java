package com.eder.dependency_injection_setter;


public class SecretaryEmployee implements Employees {

    private ReportCreation newReport;

    @Override
    public String getTasks() {
        return "I am a secretary";
    }

    @Override
    public String getReport() {
        return "Report of Secretary: " + newReport.getReport();
    }

    public void setNewReport(ReportCreation newReport) {
        this.newReport = newReport;
    }
}
