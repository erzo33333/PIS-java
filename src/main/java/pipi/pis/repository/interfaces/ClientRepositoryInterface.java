package pipi.pis.repository.interfaces;

import pipi.pis.model.Client;
import pipi.pis.model.PledgeAgreement;
import pipi.pis.model.PledgeRequest;

import java.util.List;
import java.util.Optional;

public interface ClientRepositoryInterface {
    void add(Client client);
    void remove(Client client);
    Optional<Client> findById(int id);
    List<Client> findAll();
    List<PledgeRequest> getClientRequests(int clientId);
    List<PledgeAgreement> getClientAgreements(int clientId);
}