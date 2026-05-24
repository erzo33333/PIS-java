package pipi.pis.repository.interfaces;

import pipi.pis.model.PledgeAgreement;

import java.util.List;
import java.util.Optional;

public interface PledgeAgreementRepositoryInterface {
    void add(PledgeAgreement agreement);
    void remove(PledgeAgreement agreement);
    Optional<PledgeAgreement> findById(int id);
    List<PledgeAgreement> findAll();
    List<PledgeAgreement> findAllByClient();
    void completeAgreement(int agreementId);
}
