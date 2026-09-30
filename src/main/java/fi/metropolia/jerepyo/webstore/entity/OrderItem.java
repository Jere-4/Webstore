package fi.metropolia.jerepyo.webstore.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "orderitems")
public class OrderItem {

    @EmbeddedId
    private OrderItemId id = new OrderItemId();

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("orderId")
    @JoinColumn(name = "orderid")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    @JoinColumn(name = "productid")
    private Product product;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private BigDecimal unitprice;

    public OrderItem() {
    }

    public OrderItem(Order order,
                     Product product,
                     Integer quantity,
                     BigDecimal unitprice) {

        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.unitprice = unitprice;
    }

    // getterit ja setterit
}
