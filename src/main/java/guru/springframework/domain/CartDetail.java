package guru.springframework.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by heleneshaikh on 09/01/2017.
 */
@Entity
public class CartDetail implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Version
    private Integer version;
    private int quantity;

    @ManyToOne
    private Cart cart;

    @OneToOne
    private Product product;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
