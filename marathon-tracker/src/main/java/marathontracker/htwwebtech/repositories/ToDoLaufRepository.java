package marathontracker.htwwebtech.repositories;

import marathontracker.htwwebtech.entities.ToDoLauf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoLaufRepository extends CrudRepository<ToDoLauf, Long> {
}
