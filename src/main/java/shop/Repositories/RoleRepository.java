package shop.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.Models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
