package fi.metropolia.jerepyo.webstore.entity;

import fi.metropolia.jerepyo.webstore.entity.OrderStatusConverter;
import fi.metropolia.jerepyo.webstore.entity.OrderStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class OrderS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Convert(converter = OrderStatusConverter.class)
    @Column(name = "status")
    private OrderStatus status;

    // getterit ja setterit

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
