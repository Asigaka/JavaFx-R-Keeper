package com.asigaka.r_keeper;

public class Employee {
    private String name;
    private String password;
    private String position;

    public Employee(String name, String password, String position) {
        this.name = name;
        this.password = password;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPosition() {
        return position;
    }
}
