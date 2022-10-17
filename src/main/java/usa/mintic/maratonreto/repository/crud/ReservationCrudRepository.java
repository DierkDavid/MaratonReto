package usa.mintic.maratonreto.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.maratonreto.entity.Message;
import usa.mintic.maratonreto.entity.Reservation;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {
}

