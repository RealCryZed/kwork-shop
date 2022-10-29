package shop.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.Models.Zakaz;

@Repository
public interface ZakazRepository extends CrudRepository<Zakaz, Long> {

}
