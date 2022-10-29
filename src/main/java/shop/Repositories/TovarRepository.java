package shop.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.Models.Tovar;

@Repository
public interface TovarRepository extends CrudRepository<Tovar, Long> {
}
