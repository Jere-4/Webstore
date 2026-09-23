package fi.metropolia.jerepyo.webstore;

import fi.metropolia.jerepyo.webstore.entity.Customer;
import fi.metropolia.jerepyo.webstore.entity.Order;
import fi.metropolia.jerepyo.webstore.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TestDataRunner implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public TestDataRunner(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) {

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

        customerRepository.save(customer);

        System.out.println("Asiakas tallennettu.");

        Customer savedCustomer = customerRepository
                .findById(customer.getId())
                .orElseThrow();

        System.out.println("Asiakas: "
                + savedCustomer.getFirstname());

        System.out.println("Tilaukset:");

        savedCustomer.getOrders().forEach(order ->
                System.out.println("Tilaus ID: " + order.getId())
        );
    }
}
