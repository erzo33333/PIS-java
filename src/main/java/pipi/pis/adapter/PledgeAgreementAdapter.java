package pipi.pis.adapter;

import pipi.pis.adapter.interfaces.EntityAdapter;
import pipi.pis.model.PledgeAgreement;
import pipi.pis.model.enums.AgreementStatus;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class PledgeAgreementAdapter implements EntityAdapter<PledgeAgreement> {

    @Override
    public PledgeAgreement adapt(ResultSet resultSet) throws SQLException {

        PledgeAgreement agreement = new PledgeAgreement();

        agreement.setId(
                resultSet.getLong("id")
        );

        agreement.setItemDescription(
                resultSet.getString("item_description")
        );

        agreement.setItemCategory(
                resultSet.getString("item_category")
        );

        agreement.setItemWeight(
                resultSet.getBigDecimal("item_weight")
        );

        agreement.setAppraisalValue(
                resultSet.getBigDecimal("appraisal_value")
        );

        agreement.setLoanAmount(
                resultSet.getBigDecimal("loan_amount")
        );

        agreement.setInterestRate(
                resultSet.getBigDecimal("interest_rate")
        );

        agreement.setTotalReturnAmount(
                resultSet.getBigDecimal("total_return_amount")
        );

        agreement.setStatus(
                AgreementStatus.valueOf(
                        resultSet.getString("status")
                )
        );

        Date startDate =
                resultSet.getDate("start_date");

        if (startDate != null) {
            agreement.setStartDate(
                    startDate.toLocalDate()
            );
        }

        Date endDate =
                resultSet.getDate("end_date");

        if (endDate != null) {
            agreement.setEndDate(
                    endDate.toLocalDate()
            );
        }

        Timestamp createdAt =
                resultSet.getTimestamp("created_at");

        if (createdAt != null) {
            agreement.setCreatedAt(
                    createdAt.toLocalDateTime()
            );
        }

        Timestamp updatedAt =
                resultSet.getTimestamp("updated_at");

        if (updatedAt != null) {
            agreement.setUpdatedAt(
                    updatedAt.toLocalDateTime()
            );
        }

        return agreement;
    }
}