package pipi.pis.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private static DBManager instance;

    private DBManager() {

        try {
            Class.forName(
                    "org.postgresql.Driver"
            );
        }
        catch (ClassNotFoundException e) {

            throw new RuntimeException(
                    "PostgreSQL driver not found.",
                    e
            );
        }
    }

    public static DBManager getInstance() {

        if (instance == null) {
            instance = new DBManager();
        }

        return instance;
    }

    public Connection getConnection() throws SQLException {

        return DriverManager.getConnection(
                DBConfig.URL,
                DBConfig.USER,
                DBConfig.PASSWORD
        );
    }

    public void commit(Connection connection) {

        try {

            if (connection != null) {
                connection.commit();
            }
        }
        catch (SQLException e) {

            throw new RuntimeException(
                    "Commit failed.",
                    e
            );
        }
    }

    public void rollback(Connection connection) {

        try {

            if (connection != null) {
                connection.rollback();
            }
        }
        catch (SQLException e) {

            throw new RuntimeException(
                    "Rollback failed.",
                    e
            );
        }
    }

    public void close(Connection connection) {

        try {

            if (connection != null &&
                    !connection.isClosed()) {

                connection.close();
            }
        }
        catch (SQLException e) {

            throw new RuntimeException(
                    "Connection close failed.",
                    e
            );
        }
    }
}