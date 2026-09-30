package fi.metropolia.jerepyo.webstore.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@OneToMany(
        mappedBy= "supplier",
        cascade = CascadeType.ALL,
        orphanRemoval = true
)

private List<SupplierAddress> addresses = new ArrayList<>();

public void addAddress(SupplierAddress address) {
    addresses.add(address);
    address.setSupplier(this);
}
