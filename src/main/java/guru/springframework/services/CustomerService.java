package guru.springframework.services;

import guru.springframework.domain.Customer;

import java.util.List;

/**
 * Created by jt on 11/14/15.
 */
public interface CustomerService {
    List<Customer> listAll();
    Customer getById(Integer id);
    Customer saveOrUpdate(Customer customer);
    void delete(Integer id);
}
