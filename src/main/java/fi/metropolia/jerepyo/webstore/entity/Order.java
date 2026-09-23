package fi.metropolia.jerepyo.webstore.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime order_date;
    private LocalDateTime delivery_date;

    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Order() {
    }

    // Getterit ja setterit

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getOrderdate() {
        return order_date;
    }

    public void setOrderdate(LocalDateTime orderdate) {
        this.order_date = orderdate;
    }

    public LocalDateTime getDeliverydate() {
        return delivery_date;
    }

    public void setDeliverydate(LocalDateTime deliverydate) {
        this.delivery_date = deliverydate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
