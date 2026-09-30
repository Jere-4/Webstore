package fi.metropolia.jerepyo.webstore.repository;

import fi.metropolia.jerepyo.webstore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository
        extends JpaRepository<Product, Integer> {
}
