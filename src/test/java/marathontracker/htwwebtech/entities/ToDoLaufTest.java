package marathontracker.htwwebtech.entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class ToDoLaufTest {

    @Test
    public void testToDoLaufConstructorAndGetters() {
        LocalDate datum = LocalDate.of(2023, 6, 30);
        String art = "Running";
        String titel = "Morning Run";
        Long distanz = 5000L;
        String beschreibung = "5 km run in the park";
        Boolean status = true;

        ToDoLauf toDoLauf = new ToDoLauf(datum, art, titel, distanz, beschreibung, status);

        assertThat(toDoLauf.getDatum()).isEqualTo(datum);
        assertThat(toDoLauf.getArt()).isEqualTo(art);
        assertThat(toDoLauf.getTitel()).isEqualTo(titel);
        assertThat(toDoLauf.getDistanz()).isEqualTo(distanz);
        assertThat(toDoLauf.getBeschreibung()).isEqualTo(beschreibung);
        assertThat(toDoLauf.getStatus()).isEqualTo(status);
    }

    @Test
    public void testToDoLaufSetters() {
        ToDoLauf toDoLauf = new ToDoLauf();

        LocalDate datum = LocalDate.of(2023, 6, 30);
        String art = "Running";
        String titel = "Morning Run";
        Long distanz = 5000L;
        String beschreibung = "5 km run in the park";
        Boolean status = true;

        toDoLauf.setDatum(datum);
        toDoLauf.setArt(art);
        toDoLauf.setTitel(titel);
        toDoLauf.setDistanz(distanz);
        toDoLauf.setBeschreibung(beschreibung);
        toDoLauf.setStatus(status);

        assertThat(toDoLauf.getDatum()).isEqualTo(datum);
        assertThat(toDoLauf.getArt()).isEqualTo(art);
        assertThat(toDoLauf.getTitel()).isEqualTo(titel);
        assertThat(toDoLauf.getDistanz()).isEqualTo(distanz);
        assertThat(toDoLauf.getBeschreibung()).isEqualTo(beschreibung);
        assertThat(toDoLauf.getStatus()).isEqualTo(status);
    }
}
