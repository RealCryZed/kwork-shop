package shop.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.Models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
