package com.eder.bean_life_cycle;


public class DirectoryEmployee implements Employees {

    private ReportCreation newReport;
    private String email;
    private String companyName;

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

    // Init method
    public void initMethod() {
        System.out.println("Inside this method you have to put the tasks that they will execute before" +
                " the bean is ready");
    }

    // Destroy method
    public void destroyMethod() {
        System.out.println("Inside this method you have to put the tasks they will execute after the " +
                "bean is dead");

    }
}
