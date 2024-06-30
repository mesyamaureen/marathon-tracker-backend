package marathontracker.htwwebtech.services;

import marathontracker.htwwebtech.entities.Lauf;
import marathontracker.htwwebtech.repositories.LaufRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class LaufServiceTest {

    @InjectMocks
    private LaufService service;

    @Mock
    private LaufRepository repository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveLauf() {
        Lauf lauf = new Lauf(LocalDate.of(2023, 7, 1), "Running", "Morning Run", 5L, "00:30:00", "Good", 3, "Nice run in the park", "None");

        when(repository.save(any(Lauf.class))).thenReturn(lauf);

        Lauf savedLauf = service.save(lauf);

        assertNotNull(savedLauf);
        assertEquals(LocalDate.of(2023, 7, 1), savedLauf.getDatum());
        assertEquals("Running", savedLauf.getArt());
        assertEquals("Morning Run", savedLauf.getTitel());
        assertEquals(5L, savedLauf.getDistanz());
        assertEquals("00:30:00", savedLauf.getZeit());
        assertEquals("Good", savedLauf.getGefuehl());
        assertEquals(3, savedLauf.getAufwand());
        assertEquals("Nice run in the park", savedLauf.getBeschreibung());
        assertEquals("None", savedLauf.getSchmerz());

        verify(repository, times(1)).save(any(Lauf.class));
    }

    @Test
    void testGetLauf() {
        Long id = 1L;
        Lauf lauf = new Lauf(LocalDate.of(2023, 7, 1), "Running", "Morning Run", 5L, "00:30:00", "Good", 3, "Nice run in the park", "None");
        lauf.setId(id);

        when(repository.findById(id)).thenReturn(Optional.of(lauf));

        Lauf retrievedLauf = service.get(id);

        assertNotNull(retrievedLauf);
        assertEquals(id, retrievedLauf.getId());
        assertEquals(LocalDate.of(2023, 7, 1), retrievedLauf.getDatum());
        assertEquals("Running", retrievedLauf.getArt());
        assertEquals("Morning Run", retrievedLauf.getTitel());
        assertEquals(5L, retrievedLauf.getDistanz());
        assertEquals("00:30:00", retrievedLauf.getZeit());
        assertEquals("Good", retrievedLauf.getGefuehl());
        assertEquals(3, retrievedLauf.getAufwand());
        assertEquals("Nice run in the park", retrievedLauf.getBeschreibung());
        assertEquals("None", retrievedLauf.getSchmerz());

        verify(repository, times(1)).findById(id);
    }

    @Test
    void testGetLaeufe() {
        List<Lauf> laufeList = new ArrayList<>();
        laufeList.add(new Lauf(LocalDate.of(2023, 7, 1), "Running", "Morning Run", 5L, "00:30:00", "Good", 3, "Nice run in the park", "None"));
        laufeList.add(new Lauf(LocalDate.of(2023, 7, 2), "running", "Easy Run", 3L, "00:20:00", "Okay", 2, "Relaxing walk in the evening", "None"));

        when(repository.findAll()).thenReturn(laufeList);

        List<Lauf> retrievedLaeufe = service.getLaeufe();

        assertNotNull(retrievedLaeufe);
        assertEquals(2, retrievedLaeufe.size());

        verify(repository, times(1)).findAll();
    }

    @Test
    void testUpdateLauf() {
        Long id = 1L;
        Lauf existingLauf = new Lauf(LocalDate.of(2023, 7, 1), "Running", "Morning Run", 5L, "00:30:00", "Good", 3, "Nice run in the park", "None");
        existingLauf.setId(id);

        Lauf updatedLauf = new Lauf(LocalDate.of(2023, 7, 1), "Running", "Easy Run", 10L, "00:45:00", "Great", 4, "Enjoyable running session", "None");
        updatedLauf.setId(id);

        when(repository.findById(id)).thenReturn(Optional.of(existingLauf));
        when(repository.save(any(Lauf.class))).thenReturn(updatedLauf);

        Lauf result = service.update(id, updatedLauf);

        assertNotNull(result);
        assertEquals(id, result.getId());
        assertEquals(LocalDate.of(2023, 7, 1), result.getDatum());
        assertEquals("Running", result.getArt());
        assertEquals("Easy Run", result.getTitel());
        assertEquals(10L, result.getDistanz());
        assertEquals("00:45:00", result.getZeit());
        assertEquals("Great", result.getGefuehl());
        assertEquals(4, result.getAufwand());
        assertEquals("Enjoyable running session", result.getBeschreibung());
        assertEquals("None", result.getSchmerz());

        verify(repository, times(1)).findById(id);
        verify(repository, times(1)).save(any(Lauf.class));
    }

    @Test
    void testDeleteLauf() {
        Long id = 1L;

        when(repository.existsById(id)).thenReturn(true);

        boolean result = service.delete(id);

        assertTrue(result);

        verify(repository, times(1)).existsById(id);
        verify(repository, times(1)).deleteById(id);
    }
}
