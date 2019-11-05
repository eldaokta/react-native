package com.enigma.service;

import com.enigma.enitity.Artist;
import com.enigma.enitity.Song;
import com.enigma.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongServiceImpl implements SongService{
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
        Artist artist = artistService.getArtistById( song.getArtisIdTransient());
        song.setIdArtist(artist);
        return songRepository.save(song);
    }

    @Override
    public Song getSongById(String idSong) {
        return songRepository.findById(idSong).get();
    }
}
