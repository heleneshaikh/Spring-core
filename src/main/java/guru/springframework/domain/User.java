package guru.springframework.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by heleneshaikh on 09/01/2017.
 */
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Version
    private Integer version;
    private String userName;
    @Transient
    private String password;
    private String encryptedPassword;

    //bidirectional : user is slave, customer is owner.
    @OneToOne(mappedBy = "user", cascade = {CascadeType.MERGE, CascadeType.MERGE})
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true) //if user gets deleted, cart gets deleted
    private Cart cart;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
