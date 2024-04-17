package marathontracker.htwwebtech.services;

import marathontracker.htwwebtech.entities.Lauf;
import marathontracker.htwwebtech.repositories.LaufRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LaufService {
    @Autowired
    LaufRepository laufRepository;

    public Lauf save(Lauf lauf) {
        return laufRepository.save(lauf);
    }

    public Lauf get(Long id) {
        return laufRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Lauf> getLaeufe() {
        Iterable<Lauf> iterator = laufRepository.findAll();
        List<Lauf> laeufe = new ArrayList<Lauf>();
        for (Lauf lauf : iterator) laeufe.add(lauf);
        return laeufe;
    }

    public Lauf update(Long id, Lauf lauf) {
        Lauf currentLauf = get(id);
        currentLauf.setDatum(lauf.getDatum());
        currentLauf.setArt(lauf.getArt());
        currentLauf.setTitel(lauf.getTitel());
        currentLauf.setDistanz(lauf.getDistanz());
        currentLauf.setZeit(lauf.getZeit());
        currentLauf.setGefuehl(lauf.getGefuehl());
        currentLauf.setAufwand(lauf.getAufwand());
        currentLauf.setBeschreibung(lauf.getBeschreibung());
        currentLauf.setSchmerz(lauf.getSchmerz());
        return laufRepository.save(currentLauf);
    }

    public boolean delete(Long id) {
        if (!laufRepository.existsById(id)) {
            return false;
        }
        laufRepository.deleteById(id);
        return true;
    }
}

