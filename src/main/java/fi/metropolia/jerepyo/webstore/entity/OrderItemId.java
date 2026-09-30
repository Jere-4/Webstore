package fi.metropolia.jerepyo.webstore.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemId implements Serializable {

    private Integer orderId;
    private Integer productId;

    public OrderItemId() {
    }

    public OrderItemId(Integer orderId, Integer productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    // equals() ja hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemId)) return false;

        OrderItemId that = (OrderItemId) o;

        return Objects.equals(orderId, that.orderId)
                && Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }

    // getterit ja setterit
}
