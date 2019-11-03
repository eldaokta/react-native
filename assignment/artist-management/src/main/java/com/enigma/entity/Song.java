package com.enigma.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idSong;
    private String titleSong;

    @Transient
    private String artistIdTransient;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artistId;



    public Song() {
    }

    public Song(String titleSong) {
        this.titleSong = titleSong;
    }

    public Artist getArtistId() {
        return artistId;
    }

    public void setArtistId(Artist artistId) {
        this.artistId = artistId;
    }

    public String getArtistIdTransient() {
        return artistIdTransient;
    }

    public void setArtistIdTransient(String artistIdTransient) {
        this.artistIdTransient = artistIdTransient;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return
                Objects.equals(titleSong, song.titleSong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSong, titleSong, artistIdTransient, artistId);
    }
}
