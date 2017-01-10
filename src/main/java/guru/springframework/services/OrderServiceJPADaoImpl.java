package guru.springframework.services;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

/**
 * Created by heleneshaikh on 10/01/2017.
 */

@Service
public class OrderServiceJPADaoImpl implements OrderService {
    EntityManager em;

    @PersistenceUnit
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
