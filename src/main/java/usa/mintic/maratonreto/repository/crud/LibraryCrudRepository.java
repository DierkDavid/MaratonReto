package usa.mintic.maratonreto.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.maratonreto.entity.Client;
import usa.mintic.maratonreto.entity.Library;

public interface LibraryCrudRepository extends CrudRepository<Library,Integer> {
}