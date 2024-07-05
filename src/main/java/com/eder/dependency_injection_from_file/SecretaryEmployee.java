package com.eder.dependency_injection_from_file;


public class SecretaryEmployee implements Employees {

    private ReportCreation newReport;
    private String email;
    private String companyName;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
