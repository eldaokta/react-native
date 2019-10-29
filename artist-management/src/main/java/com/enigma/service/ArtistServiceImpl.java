package com.enigma.service;

import com.enigma.entities.Artist;
import com.enigma.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    ArtistService artistService;


    @Override
    public Page<Artist> getArtist(Pageable pageable) {
        Page<Artist> page = artistRepository.findAll(pageable);
        return page;
    }

    @Override
    public Artist submitArtist(Artist artist) {
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
    public Artist saveArtist(MultipartFile multipartFile, Artist artist) {
        return artistRepository.save(artist);
    }
}

