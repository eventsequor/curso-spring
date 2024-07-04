package com.eder.inversion_of_control;

public class DirectoryEmployee implements Employees{
    @Override
    public String getTasks() {
        return "Manage the things of the company";
    }
}
