package fi.metropolia.jerepyo.webstore.controller;

import fi.metropolia.jerepyo.webstore.entity.Customer;
import fi.metropolia.jerepyo.webstore.entity.Order;
import fi.metropolia.jerepyo.webstore.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping
    public Customer createCustomer() {

        Customer customer = new Customer();
        customer.setFirstname("Matti");
        customer.setLastname("Meikäläinen");
        customer.setEmail("matti@testi.fi");

        Order order1 = new Order();
        order1.setStatus("NEW");
        order1.setOrderdate(LocalDateTime.now());

        Order order2 = new Order();
        order2.setStatus("NEW");
        order2.setOrderdate(LocalDateTime.now());

        customer.addOrder(order1);
        customer.addOrder(order2);

        return customerRepository.save(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerRepository.deleteById(id);
    }
}
