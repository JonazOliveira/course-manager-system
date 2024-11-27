package dao;

import connectdb.ConnectDB;
import entity.Studant;

import lombok.NonNull;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudantDAO {
    public void registerStudant(@NonNull Studant studant) {
        String sql = "INSERT INTO STUDANT (nome, genero, matricula, CPF, dataNascimento, idDiscipline, idCourse) VALUES (?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?)";

        PreparedStatement preparedStatement;

        try {
            preparedStatement = ConnectDB.getConnectionDB().prepareStatement(sql);

            preparedStatement.setString(1, studant.getNome());
            preparedStatement.setString(2, studant.getGenero());
            preparedStatement.setLong(3, studant.getMatricula());
            preparedStatement.setString(4, studant.getCPF());
            preparedStatement.setString(5, studant.getDataNascimento());
            preparedStatement.setInt(6, studant.getIdDiscipline());
            preparedStatement.setInt(7, studant.getIdCourse());

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
