package marathontracker.htwwebtech.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalTime;
import java.util.Date;

@Entity
public class ToDoLauf {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Date datum;
        private String art;
        private String titel;
        private Long distanz;
        private LocalTime zeit;
        private String gefuehl;
        private Integer aufwand;
        private String beschreibung;
        private String schmerz;

        //parameterloser Konstruktor
        public ToDoLauf() {}

        //Konstruktor mit parameter
        public ToDoLauf(Date datum, String art, String titel, Long distanz, LocalTime zeit, String gefuehl, Integer aufwand, String beschreibung, String schmerz) {
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

        //getter setter
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public Date getDatum() { return datum; }
        public void setDatum(Date datum) { this.datum = datum; }
        public String getArt() { return art; }
        public void setArt(String art) { this.art = art; }
        public String getTitel() { return titel; }
        public void setTitel(String titel) { this.titel = titel; }
        public Long getDistanz() { return distanz; }
        public void setDistanz(Long distanz) { this.distanz = distanz; }
        public LocalTime getZeit() { return zeit; }
        public void setZeit(LocalTime zeit) { this.zeit = zeit; }
        public String getGefuehl() { return gefuehl; }
        public void setGefuehl(String gefuehl) { this.gefuehl = gefuehl; }
        public Integer getAufwand() { return aufwand; }
        public void setAufwand(Integer aufwand) { this.aufwand = aufwand; }
        public String getBeschreibung() { return beschreibung; }
        public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }
        public String getSchmerz() { return schmerz; }
        public void setSchmerz(String schmerz) { this.schmerz = schmerz; }
}
