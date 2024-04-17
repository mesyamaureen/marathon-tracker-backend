package marathontracker.htwwebtech.controllers;

import marathontracker.htwwebtech.entities.ToDoLauf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoLaufController {
    @Autowired
    ToDoLauf service;

    @PostMapping("/laufplan")
    public ToDoLauf createToDoLauf(@RequestBody Laufplan laufplan) {
        return service.save(laufplan);
    }

    @GetMapping("/alleLaufplaene/{id}")
    public ToDoLauf getToDoLauf(@PathVariable String id) {
        Long laufplanId = Long.parseLong(id);
        return service.get(laufplanId);
    }

    @GetMapping("/alleLaufplaene")
    public List<Laufplan> getLaufplaene() {
        return service.getLaufplaene();
    }

    @PutMapping("/alleLaufplaene/{id}")
    public Laufplan updateLaufplan(@PathVariable Long id, @RequestBody Laufplan laufplan) {
        return service.update(id, laufplan);
    }

    @DeleteMapping("/alleLaufplaene/{id}")
    public boolean deleteLaufplan(@PathVariable String id) {
        Long laufplanId = Long.parseLong(id);
        return service.delete(laufplanId);
    }
}
