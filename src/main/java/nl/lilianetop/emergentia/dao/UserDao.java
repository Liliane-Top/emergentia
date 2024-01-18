package nl.lilianetop.emergentia.dao;


import nl.lilianetop.emergentia.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    User findByUsername(String username);
    boolean existsUserByUsername(String username);
}
