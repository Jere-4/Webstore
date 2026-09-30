package fi.metropolia.jerepyo.webstore.entity;

import jakarta.persistence.*;

import java.util.function.Supplier;

@Entity
@Table(name = "supplieraddresses")
public class SupplierAddress extends Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplierid")
    private Supplier supplier;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Supplier getSupplier() {
        return supplier;
   }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
