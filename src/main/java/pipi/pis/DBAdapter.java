package pipi.pis;

import pipi.pis.model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DBAdapter {

    public Admin toAdmin(ResultSet rs) throws SQLException {
        Admin admin = new Admin();
        admin.setId(rs.getInt("id"));
        admin.setFullName(rs.getString("full_name"));
        admin.setEmail(rs.getString("email"));
        admin.setPasswordHash(rs.getString("password_hash"));
        admin.setIsActive(rs.getBoolean("is_active"));
        admin.setCreatedAt(rs.getTimestamp("created_at"));
        return admin;
    }

    public Client toClient(ResultSet rs) throws SQLException {
        Client client = new Client();
        client.setId(rs.getInt("id"));
        client.setLastName(rs.getString("last_name"));
        client.setFirstName(rs.getString("first_name"));
        client.setMiddleName(rs.getString("middle_name"));
        client.setPhone(rs.getString("phone"));
        client.setPassport(rs.getString("passport"));
        client.setAddress(rs.getString("address"));
        client.setVerificationStatus(rs.getString("verification_status"));
        client.setVerificationDate(rs.getTimestamp("verification_date"));
        client.setEmail(rs.getString("email"));
        client.setPasswordHash(rs.getString("password_hash"));
        client.setIsActive(rs.getBoolean("is_active"));
        client.setCreatedAt(rs.getTimestamp("created_at"));
        return client;
    }

    public InventoryItem toInventoryItem(ResultSet rs) throws SQLException {
        InventoryItem item = new InventoryItem();
        item.setId(rs.getInt("id"));
        item.setAgreementId(rs.getInt("agreement_id"));
        item.setTitle(rs.getString("title"));
        item.setDescription(rs.getString("description"));
        item.setCategory(rs.getString("category"));
        item.setCondition(rs.getString("condition"));
        item.setPrice(rs.getInt("price"));
        item.setStatus(rs.getString("status"));
        item.setImagePath(rs.getString("image_path"));
        return item;
    }

    public PledgeAgreement toPledgeAgreement(ResultSet rs) throws SQLException {
        PledgeAgreement agreement = new PledgeAgreement();
        agreement.setId(rs.getInt("id"));
        agreement.setClientId(rs.getInt("client_id"));
        agreement.setAppraisalValue(rs.getInt("appraisal_value"));
        agreement.setLoanAmount(rs.getInt("loan_amount"));
        agreement.setInterestRate(rs.getDouble("interest_rate"));
        agreement.setStartDate(rs.getTimestamp("start_date"));
        agreement.setEndDate(rs.getTimestamp("end_date"));
        agreement.setStatus(rs.getString("status"));
        agreement.setCreatedAt(rs.getTimestamp("created_at"));
        agreement.setCreatedBy(rs.getInt("created_by"));
        return agreement;
    }

    public PledgeRequest toPledgeRequest(ResultSet rs) throws SQLException {
        PledgeRequest request = new PledgeRequest();
        request.setId(rs.getInt("id"));
        request.setClientId(rs.getInt("client_id"));
        request.setItemType(rs.getString("item_type"));
        request.setDescription(rs.getString("description"));
        request.setDesiredAmount(rs.getDouble("desired_amount"));
        request.setStatus(rs.getString("status"));
        request.setCreatedAt(rs.getTimestamp("created_at"));
        request.setProcessedBy(rs.getInt("processed_by"));
        request.setProcessedAt(rs.getTimestamp("processed_at"));
        return request;
    }

    public PriceChangeHistoryEntry toPriceChangeHistoryEntry(ResultSet rs) throws SQLException {
        PriceChangeHistoryEntry entry = new PriceChangeHistoryEntry();
        entry.setItemId(rs.getInt("item_id"));
        entry.setOldPrice(rs.getDouble("old_price"));
        entry.setNewPrice(rs.getDouble("new_price"));
        entry.setChangeReason(rs.getString("change_reason"));
        entry.setChangedBy(rs.getInt("changed_by"));
        entry.setChangedAt(rs.getTimestamp("changed_at"));
        return entry;
    }
}