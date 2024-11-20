package dao;

import connectdb.ConnectDB;
import entity.Course;

import lombok.NonNull;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseDAO {
    public void registerCourse(@NonNull Course course) {
        String sql = "INSERT INTO COURSE (nome, descricao, dataInicio, dataFinal) VALUES (?, ?, TO_DATE(?, 'YYYY-MM-DD'), TO_DATE(?, 'YYYY-MM-DD'))";

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = ConnectDB.getConnectionDB().prepareStatement(sql);

            preparedStatement.setString(1, course.getNome());
            preparedStatement.setString(2, course.getDescricao());
            preparedStatement.setString(3, course.getDataInicio());
            preparedStatement.setString(4, course.getDataFinal());

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
