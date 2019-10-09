package com.enigma.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Artist {
    @Id
    private Integer idArtist;
    private String name;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date debut;
    private String bornPlace;

    @OneToMany(mappedBy = "artist")
    private List<Song> songs;

    public Artist() {
    }

    public Artist(Integer idArtist, String name, Date debut, String bornPlace) {
        this.idArtist = idArtist;
        this.name = name;
        this.debut = debut;
        this.bornPlace = bornPlace;
    }

    public Integer getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(Integer idArtist) {
        this.idArtist = idArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
    }
}
