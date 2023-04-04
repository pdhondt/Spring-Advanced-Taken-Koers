package be.vdab.koers.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "renners")
public class Renner {
    @Id
    private long id;
    private String voornaam;
    private String familienaam;

    public long getId() {
        return id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }
}
