package pipi.pis.repository.interfaces;

import pipi.pis.model.PledgeAgreement;
import pipi.pis.model.PledgeRequest;

import java.util.List;
import java.util.Optional;

public interface PledgeRequestRepositoryInterface {
    void add(PledgeRequest request);
    void remove(PledgeRequest request);
    Optional<PledgeRequest> findById(int id);
    List<PledgeRequest> findAll();
    PledgeAgreement approve(int requestId, int adminId, int loanAmount, double interestRate);
    void reject(int requestId, int adminId, String reason);
}