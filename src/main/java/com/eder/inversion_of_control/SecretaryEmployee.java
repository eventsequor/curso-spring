package com.eder.inversion_of_control;

public class SecretaryEmployee implements Employees {

    @Override
    public String getTasks() {
        return "I am a secretary";
    }
}
