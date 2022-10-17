package usa.mintic.maratonreto.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.maratonreto.entity.Category;
import usa.mintic.maratonreto.entity.Client;

public interface ClientCrudRepository extends CrudRepository<Client,Integer> {
}