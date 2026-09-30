package fi.metropolia.jerepyo.webstore.repository;

import fi.metropolia.jerepyo.webstore.entity.SupplierAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierAddressRepository
        extends JpaRepository<SupplierAddress, Integer> {
}
