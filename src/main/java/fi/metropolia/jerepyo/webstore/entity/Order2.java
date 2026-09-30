package fi.metropolia.jerepyo.webstore.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(
            mappedBy = "order",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<OrderItem> orderItems = new ArrayList<>();

    public void addProduct(Product product,
                           Integer quantity,
                           BigDecimal unitPrice) {

        OrderItem item =
                new OrderItem(this, product, quantity, unitPrice);

        orderItems.add(item);
        product.getOrderItems().add(item);
    }

    // getterit ja setterit
}
