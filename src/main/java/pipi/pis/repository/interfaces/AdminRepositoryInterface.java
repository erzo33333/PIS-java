package pipi.pis.repository.interfaces;

import pipi.pis.model.Admin;

import java.util.Optional;

public interface AdminRepositoryInterface {
    void add(Admin admin);
    void remove(Admin admin);
    Optional<Admin> findById(int id);
}