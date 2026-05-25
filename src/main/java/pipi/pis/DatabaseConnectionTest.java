package pipi.pis;

import pipi.pis.database.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectionTest {

    public static void main(String[] args) {

        String sql = """
                SELECT id, email, role
                FROM users
                LIMIT 1
                """;

        try (
                Connection connection =
                        DBManager.getInstance().getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql);

                ResultSet resultSet =
                        statement.executeQuery()
        ) {

            if (resultSet.next()) {

                System.out.println(
                        "ID: " +
                                resultSet.getLong("id")
                );

                System.out.println(
                        "EMAIL: " +
                                resultSet.getString("email")
                );

                System.out.println(
                        "ROLE: " +
                                resultSet.getString("role")
                );
            }
            else {

                System.out.println(
                        "No data found."
                );
            }
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}