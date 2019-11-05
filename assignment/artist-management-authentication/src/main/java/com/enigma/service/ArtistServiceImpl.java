package com.enigma.service;

import com.enigma.enitity.Artist;
import com.enigma.enitity.Song;
import com.enigma.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ArtistServiceImpl implements ArtistService{
    @Autowired
    ArtistService artistService;

    @Autowired
    ArtistRepository artistRepository;

    @Override
    public Page<Artist> getArtist(Pageable pageable) {
        Page<Artist> page= artistRepository.findAll(pageable);
        return page;
    }

    @Override
    public Artist inputArtist(Artist artist) {
        for (Song songs: artist.getSongs()){
            songs.getIdArtist();
        }
        return artistRepository.save(artist);
    }

    @Override
    public Artist getArtistById(String idArtist) {
        if (!artistRepository.findById(idArtist).isPresent()){
            return new Artist();
        }
        return artistRepository.findById(idArtist).get();
    }

    @Override
    public Artist saveArtist(MultipartFile picture, Artist artist) {
        return artistRepository.save(artist);
    }
}
