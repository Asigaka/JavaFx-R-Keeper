package com.asigaka.r_keeper.database;

import com.asigaka.r_keeper.Employee;

public class DbStaff {
    public void RegisterEmployee(String name, String password, String position) {
        Employee employee = new Employee(name, password, position);
    }

    public void AuthorizeEmployee(String name, String password, String position) {

    }
}
