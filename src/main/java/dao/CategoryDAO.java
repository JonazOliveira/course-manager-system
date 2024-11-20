package dao;

import connectdb.ConnectDB;
import entity.Category;

import lombok.NonNull;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoryDAO {
    public void registerCategory(@NonNull Category category) {
        String sql = "INSERT INTO CATEGORY (descricao) VALUES (?)";

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = ConnectDB.getConnectionDB().prepareStatement(sql);

            preparedStatement.setString(1, category.getDescricao());

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
