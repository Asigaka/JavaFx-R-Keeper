package com.asigaka.r_keeper.database;

import com.asigaka.r_keeper.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbStaff {
    public void RegisterEmployee(Employee employee) {
        DbConnector connector = new DbConnector();

        String sql = "INSERT INTO staff (employee_name, employee_password, employee_position) VALUES (?,?,?)";
        try {
            PreparedStatement preparedStatement = connector.GetConnection().prepareStatement(sql);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getPassword());
            preparedStatement.setString(3, employee.getPosition());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet GetEmployee(Employee employee) {
        ResultSet result = null;
        DbConnector connector = new DbConnector();

        String sql = "SELECT * FROM staff WHERE employee_name =? AND employee_password =? AND employee_position =?";
        try {
            PreparedStatement preparedStatement = connector.GetConnection().prepareStatement(sql);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getPassword());
            preparedStatement.setString(3, employee.getPosition());

            result = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
