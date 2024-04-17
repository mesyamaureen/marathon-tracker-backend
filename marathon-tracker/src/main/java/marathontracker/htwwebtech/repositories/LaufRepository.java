package marathontracker.htwwebtech.repositories;

import marathontracker.htwwebtech.entities.Lauf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaufRepository extends CrudRepository<Lauf, Long> {
}
