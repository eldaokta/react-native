package com.enigma.service;

import com.enigma.entity.Artist;
import com.enigma.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ArtistServiceImplement implements ArtistService{

    @Autowired
    ArtistService artistService;

    @Autowired
    ArtistRepository artistRepository;

    @Override
    public Page<Artist> getArtis(Pageable pageable) {
        Page<Artist> page= artistRepository.findAll(pageable);
        return page;
    }

    @Override
    public Artist inputArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public Artist getArtistById(String id) {
        if (!artistRepository.findById(id).isPresent()) {
            return new Artist();
        }
        return artistRepository.findById(id).get();
    }

    @Override
    public Artist saveArtist(MultipartFile picture, Artist artist) {
        return artistRepository.save(artist);
    }
}
