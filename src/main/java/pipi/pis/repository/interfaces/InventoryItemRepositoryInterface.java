package pipi.pis.repository.interfaces;

import pipi.pis.model.InventoryItem;

import java.util.List;
import java.util.Optional;

public interface InventoryItemRepositoryInterface {
    void add(InventoryItem item);
    void remove(InventoryItem item);
    Optional<InventoryItem> findById(int id);
    List<InventoryItem> findAll();
    List<InventoryItem> findItemsByAgreement(int agreementId);
    List<InventoryItem> findAllByClient(int clientId);
    void changeStatus(int itemId, int agreementId);
    void updatePrice(int itemId, int newPrice);
}