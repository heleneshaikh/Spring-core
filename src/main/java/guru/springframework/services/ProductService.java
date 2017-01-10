package guru.springframework.services;

import guru.springframework.domain.Product;

import java.util.List;

/**
 * Created by jt on 11/6/15.
 */
public interface ProductService {
    public List<Product> listAll();
    Product getById(Integer id);
    Product saveOrUpdate(Product product);
    void delete(Integer id);

}
