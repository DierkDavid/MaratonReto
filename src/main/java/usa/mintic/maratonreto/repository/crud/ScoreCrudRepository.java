package usa.mintic.maratonreto.repository.crud;

import org.springframework.data.repository.CrudRepository;
import usa.mintic.maratonreto.entity.Reservation;
import usa.mintic.maratonreto.entity.Score;

public interface ScoreCrudRepository extends CrudRepository<Score,Integer> {
}