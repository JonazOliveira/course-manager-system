package dao;

import connectdb.ConnectDB;
import entity.Employee;

import lombok.NonNull;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
    public void registerEmployee(@NonNull Employee employee) {
        String sql = "INSERT INTO EMPLOYEE (nome, CPF, dataInicio, dataFinal, salario, funcao) VALUES (?, ?, TO_DATE(?, 'YYYY-MM-DD'), TO_DATE(?, 'YYYY-MM-DD'), ?, ?)";

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = ConnectDB.getConnectionDB().prepareStatement(sql);

            preparedStatement.setString(1, employee.getNome());
            preparedStatement.setString(2, employee.getCPF());
            preparedStatement.setString(3, employee.getDataInicio());
            preparedStatement.setString(4, employee.getDataFinal());
            preparedStatement.setDouble(5, employee.getSalario());
            preparedStatement.setString(6, employee.getFuncao());

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
