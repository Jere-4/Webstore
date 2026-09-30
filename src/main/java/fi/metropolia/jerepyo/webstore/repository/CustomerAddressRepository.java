package fi.metropolia.jerepyo.webstore.repository;

import fi.metropolia.jerepyo.webstore.entity.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAddressRepository
        extends JpaRepository<CustomerAddress, Integer> {
}
