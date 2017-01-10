package guru.springframework.services;

import guru.springframework.config.JPAIntegrationConfig;
import guru.springframework.domain.Customer;
import guru.springframework.domain.User;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by heleneshaikh on 09/01/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(JPAIntegrationConfig.class)

public class CustomerServiceJPADaoImplTest {
    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Test
    public void listTest() throws Exception {
        List<Customer> customerList = customerService.listAll();
        assert customerList.size() > 0;
    }

    @Test
    public void getById() throws Exception {
        Integer id = 2;
        Customer customer = customerService.getById(id);
        assert customer.getId() == 2;
    }

    @Test
    public void deleteByIdTest() throws Exception {
        Integer id = 1;
        customerService.delete(id);
        assertNull("should be null", customerService.getById(1));
    }

    @Test
    public void saveTestWithUser() throws Exception {
        Customer customer = new Customer();
        User user = new User();
        user.setUserName("This is my user name");
        user.setPassword("Password");
        customer.setUser(user);

        Customer savedCustomer = customerService.saveOrUpdate(customer);

        assert savedCustomer.getUser().getId() != null;
    }

}
