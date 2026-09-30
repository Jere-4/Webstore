package fi.metropolia.jerepyo.webstore.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@OneToMany(
        mappedBy = "customer",
        cascade = CascadeType.ALL,
        orphanRemoval = true
)
private List<CustomerAddress> addresses = new ArrayList<>();

public void addAddress(CustomerAddress address) {
    addresses.add(address);
    address.setCustomer(this);
}

