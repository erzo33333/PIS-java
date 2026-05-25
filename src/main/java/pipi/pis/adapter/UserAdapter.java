package pipi.pis.adapter;

import pipi.pis.adapter.interfaces.EntityAdapter;
import pipi.pis.model.User;
import pipi.pis.model.enums.UserRole;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class UserAdapter implements EntityAdapter<User> {

    @Override
    public User adapt(ResultSet resultSet) throws SQLException {

        User user = new User();

        user.setId(
                resultSet.getLong("id")
        );

        user.setEmail(
                resultSet.getString("email")
        );

        user.setPasswordHash(
                resultSet.getString("password_hash")
        );

        user.setRole(
                UserRole.valueOf(
                        resultSet.getString("role")
                )
        );

        user.setIsActive(
                resultSet.getBoolean("is_active")
        );

        Timestamp createdAt =
                resultSet.getTimestamp("created_at");

        if (createdAt != null) {
            user.setCreatedAt(
                    createdAt.toLocalDateTime()
            );
        }

        Timestamp updatedAt =
                resultSet.getTimestamp("updated_at");

        if (updatedAt != null) {
            user.setUpdatedAt(
                    updatedAt.toLocalDateTime()
            );
        }

        return user;
    }
}