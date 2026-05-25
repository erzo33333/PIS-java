package pipi.pis.adapter;

import pipi.pis.adapter.interfaces.EntityAdapter;
import pipi.pis.model.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class AdminAdapter implements EntityAdapter<Admin> {

    @Override
    public Admin adapt(ResultSet resultSet) throws SQLException {

        Admin admin = new Admin();

        admin.setId(
                resultSet.getLong("id")
        );

        admin.setFullName(
                resultSet.getString("full_name")
        );

        admin.setPosition(
                resultSet.getString("position")
        );

        Timestamp createdAt =
                resultSet.getTimestamp("created_at");

        if (createdAt != null) {
            admin.setCreatedAt(
                    createdAt.toLocalDateTime()
            );
        }

        return admin;
    }
}