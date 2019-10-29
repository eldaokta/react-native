package com.enigma.service;

import com.enigma.entities.Song;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface SongService {
    public List<Song> getAllSong();
    public Song saveSong(Song song);
    public Song getSongById(String idSong);
}
