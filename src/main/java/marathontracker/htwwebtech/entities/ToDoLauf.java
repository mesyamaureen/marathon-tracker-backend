package marathontracker.htwwebtech.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class ToDoLauf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate datum;
    private String art;
    private String titel;
    private Long distanz;
    private String beschreibung;
    private Boolean status;

    public ToDoLauf(){}

    public ToDoLauf(LocalDate datum, String art, String titel, Long distanz, String beschreibung, Boolean status) {
        this.datum = datum;
        this.art = art;
        this.titel = titel;
        this.distanz = distanz;
        this.beschreibung = beschreibung;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDate getDatum() { return datum; }
    public void setDatum(LocalDate datum) { this.datum = datum; }
    public String getArt() { return  art; }
    public void setArt(String art) { this.art = art; }
    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }
    public Long getDistanz() { return distanz; }
    public void setDistanz(Long distanz) { this.distanz = distanz; }
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }
    public Boolean getStatus() { return status;}
    public void setStatus(Boolean status) {this.status = status; }
}
