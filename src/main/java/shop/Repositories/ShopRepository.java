package shop.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.Models.Shop;

@Repository
public interface ShopRepository extends CrudRepository<Shop, Long> {
}
