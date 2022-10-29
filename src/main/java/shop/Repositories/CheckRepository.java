package shop.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.Models.Check;

@Repository
public interface CheckRepository extends CrudRepository<Check, Long> {
}
