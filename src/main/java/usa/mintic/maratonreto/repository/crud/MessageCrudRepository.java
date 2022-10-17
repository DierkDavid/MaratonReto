package usa.mintic.maratonreto.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.maratonreto.entity.Library;
import usa.mintic.maratonreto.entity.Message;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
}