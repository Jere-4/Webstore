package fi.metropolia.jerepyo.webstore.repository;

import fi.metropolia.jerepyo.webstore.entity.OrderS;
import fi.metropolia.jerepyo.webstore.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderSRepository
        extends JpaRepository<OrderS, Integer> {

    List<OrderS> findByStatus(OrderStatus status);

}
