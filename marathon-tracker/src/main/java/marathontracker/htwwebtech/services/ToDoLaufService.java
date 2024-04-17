package marathontracker.htwwebtech.services;

import marathontracker.htwwebtech.entities.ToDoLauf;
import marathontracker.htwwebtech.repositories.ToDoLaufRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoLaufService {
    @Autowired
    ToDoLaufRepository ToDoLaufRepo;

    public ToDoLauf save(ToDoLauf todolauf) { return ToDoLaufRepo.save(todolauf); }

    public ToDoLauf get(Long id) {
        return ToDoLaufRepo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<ToDoLauf> getToDoLaufs() {
        Iterable<ToDoLauf> iterator = ToDoLaufRepo.findAll();
        List<ToDoLauf> toDoLaufs = new ArrayList<ToDoLauf>();
        for (ToDoLauf toDoLauf : iterator) toDoLaufs.add(toDoLauf);
        return toDoLaufs;
    }

    public ToDoLauf update(Long id, ToDoLauf toDoLauf) {
        ToDoLauf currentToDoLauf = get(id);
        currentToDoLauf.setDatum(toDoLauf.getDatum());
        currentToDoLauf.setArt(toDoLauf.getArt());
        currentToDoLauf.setTitel(toDoLauf.getTitel());
        currentToDoLauf.setBeschreibung(toDoLauf.getBeschreibung());
        currentToDoLauf.setStatus(toDoLauf.getStatus());
        currentToDoLauf.setZeit(toDoLauf.getZeit());
        return ToDoLaufRepo.save(currentToDoLauf);
    }

    public boolean delete(Long id) {
        if (!ToDoLaufRepo.existsById(id)) {
            return false;
        }
        ToDoLaufRepo.deleteById(id);
        return true;
    }
}
