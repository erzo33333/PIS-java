package pipi.pis.adapter;

import pipi.pis.adapter.interfaces.EntityAdapter;
import pipi.pis.model.Client;
import pipi.pis.model.enums.VerificationStatus;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ClientAdapter implements EntityAdapter<Client> {

    @Override
    public Client adapt(ResultSet resultSet) throws SQLException {

        Client client = new Client();

        client.setId(
                resultSet.getLong("id")
        );

        client.setFullName(
                resultSet.getString("full_name")
        );

        client.setPhone(
                resultSet.getString("phone")
        );

        client.setPassport(
                resultSet.getString("passport")
        );

        client.setRegistrationAddress(
                resultSet.getString("registration_address")
        );

        client.setVerificationStatus(
                VerificationStatus.valueOf(
                        resultSet.getString("verification_status")
                )
        );

        client.setPassportMainPhotoPath(
                resultSet.getString("passport_main_photo_path")
        );

        client.setPassportRegistrationPhotoPath(
                resultSet.getString("passport_registration_photo_path")
        );

        Timestamp createdAt =
                resultSet.getTimestamp("created_at");

        if (createdAt != null) {
            client.setCreatedAt(
                    createdAt.toLocalDateTime()
            );
        }

        Timestamp updatedAt =
                resultSet.getTimestamp("updated_at");

        if (updatedAt != null) {
            client.setUpdatedAt(
                    updatedAt.toLocalDateTime()
            );
        }

        return client;
    }
}