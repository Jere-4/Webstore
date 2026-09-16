package fi.metropolia.jerepyo.webstore.repository;

import fi.metropolia.jerepyo.webstore.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository
        extends JpaRepository<ProductCategory, Integer> {
}
