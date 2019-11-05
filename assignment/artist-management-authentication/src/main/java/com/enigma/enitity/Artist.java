package com.enigma.enitity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "mst_artist")
public class Artist {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idArtist;
    private String name;
    private String bornPlace;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date debutDate;

    @OneToMany(mappedBy = "idArtist", cascade = CascadeType.PERSIST)
    private List<Song> songs = new ArrayList<>();

    public Artist() {
    }

    public Artist(String name, String bornPlace, Date debutDate, List<Song> songs) {
        this.name = name;
        this.bornPlace = bornPlace;
        this.debutDate = debutDate;
        this.songs = songs;
    }

    public String getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(String idArtist) {
        this.idArtist = idArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
    }

    public Date getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(Date debutDate) {
        this.debutDate = debutDate;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(idArtist, artist.idArtist) &&
                Objects.equals(name, artist.name) &&
                Objects.equals(bornPlace, artist.bornPlace) &&
                Objects.equals(debutDate, artist.debutDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArtist, name, bornPlace, debutDate);
    }
}
