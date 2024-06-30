package marathontracker.htwwebtech.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Lauf {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private LocalDate datum;
        private String art;
        private String titel;
        private Long distanz;
        private String zeit;
        private String gefuehl;
        private Integer aufwand;
        private String beschreibung;
        private String schmerz;

        public Lauf() {}

        public Lauf(LocalDate datum, String art, String titel, Long distanz, String zeit, String gefuehl, Integer aufwand, String beschreibung, String schmerz) {
            this.datum = datum;
            this.art = art;
            this.titel = titel;
            this.distanz = distanz;
            this.zeit = zeit;
            this.gefuehl = gefuehl;
            this.aufwand = aufwand;
            this.beschreibung = beschreibung;
            this.schmerz = schmerz;
        }

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public LocalDate getDatum() { return datum; }
        public void setDatum(LocalDate datum) { this.datum = datum; }
        public String getArt() { return art; }
        public void setArt(String art) { this.art = art; }
        public String getTitel() { return titel; }
        public void setTitel(String titel) { this.titel = titel; }
        public Long getDistanz() { return distanz; }
        public void setDistanz(Long distanz) { this.distanz = distanz; }
        public String getZeit() { return zeit; }
        public void setZeit(String zeit) { this.zeit = zeit; }
        public String getGefuehl() { return gefuehl; }
        public void setGefuehl(String gefuehl) { this.gefuehl = gefuehl; }
        public Integer getAufwand() { return aufwand; }
        public void setAufwand(Integer aufwand) { this.aufwand = aufwand; }
        public String getBeschreibung() { return beschreibung; }
        public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }
        public String getSchmerz() { return schmerz; }
        public void setSchmerz(String schmerz) { this.schmerz = schmerz; }
}
