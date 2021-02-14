package org.magnuson.amerisave.customer.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.magnuson.amerisave.customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

/**
 * CustomerRepositoryTest
 *
 * TODO: Write out more tests, including the Rest endpoints with Mockito
 *
 */
@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        Customer c1 = new Customer();
        c1.setFirstName("Michael");
        c1.setLastName("Jackson");
        c1.setEmailAddress("mjackson@example.com");
        c1.setPhoneNumber("(303) 555-1212");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Janet");
        c2.setLastName("Jackson");
        c2.setEmailAddress("jjackson@example.com");
        c2.setPhoneNumber("(303) 555-1212");
        customerRepository.save(c2);
    }

    @Test
    void findByLastName() {
        List<Customer> results = customerRepository.findByLastName("Jackson");
        assert results.size() == 2;
        assert results.get(0).getFirstName().equals("Michael");
    }

    //TODO: Write more tests for the Repository.
}