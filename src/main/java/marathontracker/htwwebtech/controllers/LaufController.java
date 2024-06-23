package marathontracker.htwwebtech.controllers;

import marathontracker.htwwebtech.entities.Lauf;
import marathontracker.htwwebtech.services.LaufService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaufController {
    @Autowired
    LaufService service;
    // test - render
    @CrossOrigin(origins = "https://marathon-tracker-frontend.onrender.com")
    @PostMapping("/lauf")
    public Lauf createLauf(@RequestBody Lauf lauf) {
        return service.save(lauf);
    }

    @GetMapping("/alleLaeufe/{id}")
    public Lauf getLauf(@PathVariable String id) {
        Long laufId = Long.parseLong(id);
        return service.get(laufId);
    }

    @GetMapping("/alleLaeufe")
    public List<Lauf> getLaeufe() {
        return service.getLaeufe();
    }


    @PutMapping("/alleLaeufe/{id}")
    public Lauf updateLauf(@PathVariable Long id, @RequestBody Lauf lauf) {
        return service.update(id, lauf);
    }

    @DeleteMapping("/alleLaeufe/{id}")
    public boolean deleteLauf(@PathVariable String id) {
        Long laufId = Long.parseLong(id);
        return service.delete(laufId);
    }
}
