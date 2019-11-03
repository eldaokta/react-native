package com.enigma.service;

import com.enigma.entity.Song;

import java.util.List;

public interface SongService {

    public List<Song> getListSong();
    public Song saveSong(Song song);
    public Song getSongById(String id);

}
