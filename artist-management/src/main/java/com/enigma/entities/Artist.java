package com.enigma.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "mst_artist")
public class Artist<Song> {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idArtist;
    private String name;
    private  String bornPlace;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date debutDate;

    @JsonIgnore
    @OneToMany(mappedBy = "artist", cascade = CascadeType.PERSIST)
    private List<Song> songs;

    public Artist(String name, String bornPlace) {
        this.name = name;
        this.bornPlace = bornPlace;
    }

    public Artist() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(idArtist, artist.idArtist) &&
                Objects.equals(name, artist.name) &&
                Objects.equals(bornPlace, artist.bornPlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArtist, name, bornPlace, debutDate, songs);
    }
}
