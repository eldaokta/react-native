package com.enigma.enitity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mst_song")
public class Song {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idSong;
    private String titleSong;

    @Transient
    private String artisIdTransient;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_artist")
    private Artist idArtist;

    public Song() {
    }

    public Song(String titleSong, String artisIdTransient, Artist idArtist) {
        this.titleSong = titleSong;
        this.artisIdTransient = artisIdTransient;
        this.idArtist = idArtist;
    }

    public String getIdSong() {
        return idSong;
    }

    public void setIdSong(String idSong) {
        this.idSong = idSong;
    }

    public String getTitleSong() {
        return titleSong;
    }

    public void setTitleSong(String titleSong) {
        this.titleSong = titleSong;
    }

    public String getArtisIdTransient() {
        return artisIdTransient;
    }

    public void setArtisIdTransient(String artisIdTransient) {
        this.artisIdTransient = artisIdTransient;
    }

    public Artist getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(Artist idArtist) {
        this.idArtist = idArtist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(idSong, song.idSong) &&
                Objects.equals(titleSong, song.titleSong) &&
                Objects.equals(artisIdTransient, song.artisIdTransient) &&
                Objects.equals(idArtist, song.idArtist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSong, titleSong, artisIdTransient, idArtist);
    }

}
