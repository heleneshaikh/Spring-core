package guru.springframework.services;

import guru.springframework.domain.User;

import java.util.List;

/**
 * Created by heleneshaikh on 09/01/2017.
 */
public interface UserService {
    List<User> listAll();
    User getById(Integer id);
    User saveOrUpdate(User customer);
    void delete(Integer id);

}
