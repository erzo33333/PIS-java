package pipi.pis.adapter;

import pipi.pis.adapter.interfaces.EntityAdapter;
import pipi.pis.model.InventoryItem;
import pipi.pis.model.enums.InventoryStatus;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class InventoryItemAdapter implements EntityAdapter<InventoryItem> {

    @Override
    public InventoryItem adapt(ResultSet resultSet) throws SQLException {

        InventoryItem item = new InventoryItem();

        item.setId(
                resultSet.getLong("id")
        );

        item.setItemName(
                resultSet.getString("item_name")
        );

        item.setItemDescription(
                resultSet.getString("item_description")
        );

        item.setCategory(
                resultSet.getString("category")
        );

        item.setEstimatedPrice(
                resultSet.getBigDecimal("estimated_price")
        );

        item.setSalePrice(
                resultSet.getBigDecimal("sale_price")
        );

        item.setStatus(
                InventoryStatus.valueOf(
                        resultSet.getString("status")
                )
        );

        Timestamp createdAt =
                resultSet.getTimestamp("created_at");

        if (createdAt != null) {
            item.setCreatedAt(
                    createdAt.toLocalDateTime()
            );
        }

        Timestamp updatedAt =
                resultSet.getTimestamp("updated_at");

        if (updatedAt != null) {
            item.setUpdatedAt(
                    updatedAt.toLocalDateTime()
            );
        }

        return item;
    }
}