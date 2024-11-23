package dao;

import connectdb.ConnectDB;
import entity.Discipline;

import lombok.NonNull;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DisciplineDAO {
    public void registerDiscipline(@NonNull Discipline discipline) {
        String sql = "INSERT INTO DISCIPLINE (nome, descricao, workload, mensalidade, idCategory, idEmployee, idCourse) VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement;

        try {
            preparedStatement = ConnectDB.getConnectionDB().prepareStatement(sql);

            preparedStatement.setString(1, discipline.getNome());
            preparedStatement.setString(2, discipline.getDescricao());
            preparedStatement.setInt(3, discipline.getWorkload());
            preparedStatement.setDouble(4, discipline.getMensalidade());
            preparedStatement.setShort(5, discipline.getIdCategory());
            preparedStatement.setInt(6, discipline.getIdEmployee());
            preparedStatement.setInt(7, discipline.getIdCourse());

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
