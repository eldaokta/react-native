package com.enigma.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Song {
    @Id
    private Integer idSong;
    private String titleSong;

    @ManyToOne
    private Artist artist;

    public Song() {
    }

    public Song(Integer idSong, String titleSong, Artist artist) {
        this.idSong = idSong;
        this.titleSong = titleSong;
        this.artist = artist;
    }

    public Integer getIdSong() {
        return idSong;
    }

    public void setIdSong(Integer idSong) {
        this.idSong = idSong;
    }

    public String getTitleSong() {
        return titleSong;
    }

    public void setTitleSong(String titleSong) {
        this.titleSong = titleSong;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
