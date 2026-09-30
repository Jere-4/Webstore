package fi.metropolia.jerepyo.webstore.entity;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;

public class Sale {
    @Modifying
    @Transactional
    @Query("""
    UPDATE Product p
    SET p.price = p.price * :discountFactor
    WHERE p.category.id = :categoryId
""")
    int applyDiscount(
            @Param("discountFactor") BigDecimal discountFactor,
            @Param("categoryId") Long categoryId) {
        return 0;
    }
}
