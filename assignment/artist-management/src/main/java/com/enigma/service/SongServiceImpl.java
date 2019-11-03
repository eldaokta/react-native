package com.enigma.service;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    SongService songService;

    @Autowired
    SongRepository songRepository;

    @Autowired
    ArtistService artistService;

    @Override
    public List<Song> getListSong() {
        return songRepository.findAll();
    }

    @Override
    public Song saveSong(Song song) {
        Artist artist = artistService.getArtistById( song.getArtistIdTransient());
        song.setArtistId(artist);
        return songRepository.save(song);
    }

    @Override
    public Song getSongById(String id) {
        return songRepository.findById(id).get();
    }
}
