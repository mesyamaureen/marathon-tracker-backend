package marathontracker.htwwebtech.controllers;

import marathontracker.htwwebtech.entities.ToDoLauf;
import marathontracker.htwwebtech.services.ToDoLaufService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoLaufController {
    @Autowired
    ToDoLaufService service;

    @CrossOrigin(origins = "https://marathon-tracker-frontend.onrender.com")
    @PostMapping("/todolauf")
    public ToDoLauf createToDoLauf(@RequestBody ToDoLauf toDoLauf) {
        return service.save(toDoLauf);
    }

    @CrossOrigin(origins = "https://marathon-tracker-frontend.onrender.com")
    @GetMapping("/alleToDoLaufs/{id}")
    public ToDoLauf getToDoLauf(@PathVariable String id) {
        Long toDoLaufId = Long.parseLong(id);
        return service.get(toDoLaufId);
    }

    @CrossOrigin(origins = "https://marathon-tracker-frontend.onrender.com")
    @GetMapping("/alleToDoLaufs")
    public List<ToDoLauf> getToDoLaufs() {
        return service.getToDoLaufs();
    }

    @CrossOrigin(origins = "https://marathon-tracker-frontend.onrender.com")
    @PutMapping("/alleToDoLaufs/{id}")
    public ToDoLauf updateToDoLauf(@PathVariable Long id, @RequestBody ToDoLauf toDoLauf) {
        return service.update(id, toDoLauf);
    }

    @CrossOrigin(origins = "https://marathon-tracker-frontend.onrender.com")
    @DeleteMapping("/alleToDoLaufs/{id}")
    public boolean deleteToDoLauf(@PathVariable String id) {
        Long toDoLaufId = Long.parseLong(id);
        return service.delete(toDoLaufId);
    }
}
