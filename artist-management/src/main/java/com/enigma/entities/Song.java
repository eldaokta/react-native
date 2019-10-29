//package com.enigma.entities;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "mst_song")
//public class Song {
//    @Id
//    @GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name = "system-uuid", strategy = "uuid")
//    private String idSong;
//    private String titleSong;
//
//    @ManyToOne
//    @JoinColumn(name = "id_artist")
//    private com.enigma.entity.Artist artist;
//
//    @Transient
//    private String idArtist;
//
//    public Song() {
//    }
//
//    public Song(String titleSong, Artist artist, String idArtist) {
//        this.titleSong = titleSong;
//        this.artist = artist;
//        this.idArtist = idArtist;
//    }
//
//    public Song(String titleSong) {
//        this.titleSong = titleSong;
//    }
//
//    public String getIdSong() {
//        return idSong;
//    }
//
//    public void setIdSong(String idSong) {
//        this.idSong = idSong;
//    }
//
//    public String getTitleSong() {
//        return titleSong;
//    }
//
//    public void setTitleSong(String titleSong) {
//        this.titleSong = titleSong;
//    }
//
//    public Artist getArtist() {
//        return artist;
//    }
//
//    public void setArtist(Artist artist) {
//        this.artist = artist;
//    }
//
//    public String getIdArtist() {
//        return idArtist;
//    }
//
//    public void setIdArtist(String idArtist) {
//        this.idArtist = idArtist;
//    }
//}
