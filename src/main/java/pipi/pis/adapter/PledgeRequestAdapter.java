package pipi.pis.adapter;

import pipi.pis.adapter.interfaces.EntityAdapter;
import pipi.pis.model.PledgeRequest;
import pipi.pis.model.enums.PledgeRequestStatus;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class PledgeRequestAdapter implements EntityAdapter<PledgeRequest> {

    @Override
    public PledgeRequest adapt(ResultSet resultSet) throws SQLException {

        PledgeRequest request = new PledgeRequest();

        request.setId(
                resultSet.getLong("id")
        );

        request.setItemType(
                resultSet.getString("item_type")
        );

        request.setItemDescription(
                resultSet.getString("item_description")
        );

        request.setDesiredLoanAmount(
                resultSet.getBigDecimal("desired_loan_amount")
        );

        request.setStatus(
                PledgeRequestStatus.valueOf(
                        resultSet.getString("status")
                )
        );

        Timestamp createdAt =
                resultSet.getTimestamp("created_at");

        if (createdAt != null) {
            request.setCreatedAt(
                    createdAt.toLocalDateTime()
            );
        }

        Timestamp updatedAt =
                resultSet.getTimestamp("updated_at");

        if (updatedAt != null) {
            request.setUpdatedAt(
                    updatedAt.toLocalDateTime()
            );
        }

        return request;
    }
}