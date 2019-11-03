package com.enigma.enitity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
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

    public Artist() {
    }

    public Artist(String name, String bornPlace, Date debutDate) {
        this.name = name;
        this.bornPlace = bornPlace;
        this.debutDate = debutDate;
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
                Objects.equals(bornPlace, artist.bornPlace) &&
                Objects.equals(debutDate, artist.debutDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArtist, name, bornPlace, debutDate);
    }
}
