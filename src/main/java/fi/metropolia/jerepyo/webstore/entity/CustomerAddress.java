package fi.metropolia.jerepyo.webstore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customeraddresses")
public class CustomerAddress extends Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerid")
    private Customer customer;

    public Integer getId() {
        return id;
    }

   public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
            this.customer = customer;
    }
}
