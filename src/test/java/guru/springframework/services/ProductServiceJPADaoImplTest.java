package guru.springframework.services;

import guru.springframework.config.JPAIntegrationConfig;
import guru.springframework.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNull;

/**
 * Created by heleneshaikh on 09/01/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(JPAIntegrationConfig.class) //database creation with hibernate, data injection

public class ProductServiceJPADaoImplTest {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Test
    public void listTest() throws Exception {
        List<Product> productList  = productService.listAll();
        assert productList.size() == 4;
    }

    @Test
    public void getByIdTest() throws Exception {
        Integer id = 2;
        Product product = productService.getById(id);
        assert product.getId() == 2;
    }

    @Test
    public void deleteByIdTest() throws Exception {
        Integer id = 1;
        productService.delete(id);
        assertNull("should be null", productService.getById(1));
    }
}
