package cl.bennu.springbootlabs2.dao.iface;

import cl.bennu.springbootlabs2.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IUserDAO {

    List<User> getAll();

    List<User> find(User user);

    User getById(Long id);

    void save(User user);

    void delete(Long id);


}
