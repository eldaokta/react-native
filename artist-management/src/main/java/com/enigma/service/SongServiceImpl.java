package com.enigma.service;

import com.enigma.entities.Artist;
import com.enigma.entities.Song;
import com.enigma.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SongServiceImpl implements SongService {
    @Autowired
    SongRepository songRepository;

    @Autowired
    ArtistService artistService;


    @Override
    public List<Song> getAllSong() {
        return songRepository.findAll();
    }

    @Override
    public Song saveSong(Song song) {
        Artist artist= artistService.getArtistById(song.getIdArtist());
        song.setArtist(artist);
        return songRepository.save(song);
    }

    @Override
    public Song getSongById(String idSong) {
        return songRepository.findById(idSong).get();
    }
}
