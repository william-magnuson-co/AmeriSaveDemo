package org.magnuson.amerisave.customer.repository;

import org.magnuson.amerisave.customer.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Customer Repository maps to Endpoints "/customer"
 */
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    /**
     * findByLastName - as it says, find a list of Customers by their last name.
     * @param lastName customer's last name
     * @return List of customers
     */
    List<Customer> findByLastName(@Param("lastName") String lastName);

    // Additional functionality for finding records when needed.
}
