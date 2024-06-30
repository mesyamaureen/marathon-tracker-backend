package marathontracker.htwwebtech.entities;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

public class LaufTest {

    @Test
    public void testNoArgsConstructor() {
        Lauf lauf = new Lauf();
        assertThat(lauf.getId()).isNull();
        assertThat(lauf.getDatum()).isNull();
        assertThat(lauf.getArt()).isNull();
        assertThat(lauf.getTitel()).isNull();
        assertThat(lauf.getDistanz()).isNull();
        assertThat(lauf.getZeit()).isNull();
        assertThat(lauf.getGefuehl()).isNull();
        assertThat(lauf.getAufwand()).isNull();
        assertThat(lauf.getBeschreibung()).isNull();
        assertThat(lauf.getSchmerz()).isNull();
    }

    @Test
    public void testAllArgsConstructor() {
        LocalDate datum = LocalDate.of(2023, 6, 30);
        String art = "Training";
        String titel = "Morning Run";
        Long distanz = 10000L;
        String zeit = "01:00:00";
        String gefuehl = "Good";
        Integer aufwand = 5;
        String beschreibung = "Nice weather and felt great";
        String schmerz = "None";

        Lauf lauf = new Lauf(datum, art, titel, distanz, zeit, gefuehl, aufwand, beschreibung, schmerz);

        assertThat(lauf.getDatum()).isEqualTo(datum);
        assertThat(lauf.getArt()).isEqualTo(art);
        assertThat(lauf.getTitel()).isEqualTo(titel);
        assertThat(lauf.getDistanz()).isEqualTo(distanz);
        assertThat(lauf.getZeit()).isEqualTo(zeit);
        assertThat(lauf.getGefuehl()).isEqualTo(gefuehl);
        assertThat(lauf.getAufwand()).isEqualTo(aufwand);
        assertThat(lauf.getBeschreibung()).isEqualTo(beschreibung);
        assertThat(lauf.getSchmerz()).isEqualTo(schmerz);
    }

    @Test
    public void testSettersAndGetters() {
        Lauf lauf = new Lauf();
        LocalDate datum = LocalDate.of(2023, 6, 30);
        lauf.setDatum(datum);
        assertThat(lauf.getDatum()).isEqualTo(datum);

        String art = "Training";
        lauf.setArt(art);
        assertThat(lauf.getArt()).isEqualTo(art);

        String titel = "Morning Run";
        lauf.setTitel(titel);
        assertThat(lauf.getTitel()).isEqualTo(titel);

        Long distanz = 10000L;
        lauf.setDistanz(distanz);
        assertThat(lauf.getDistanz()).isEqualTo(distanz);

        String zeit = "01:00:00";
        lauf.setZeit(zeit);
        assertThat(lauf.getZeit()).isEqualTo(zeit);

        String gefuehl = "Good";
        lauf.setGefuehl(gefuehl);
        assertThat(lauf.getGefuehl()).isEqualTo(gefuehl);

        Integer aufwand = 5;
        lauf.setAufwand(aufwand);
        assertThat(lauf.getAufwand()).isEqualTo(aufwand);

        String beschreibung = "Nice weather and felt great";
        lauf.setBeschreibung(beschreibung);
        assertThat(lauf.getBeschreibung()).isEqualTo(beschreibung);

        String schmerz = "None";
        lauf.setSchmerz(schmerz);
        assertThat(lauf.getSchmerz()).isEqualTo(schmerz);
    }
}
