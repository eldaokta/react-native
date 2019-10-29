package com.enigma.service;

import com.enigma.entities.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;


public interface ArtistService {

    public Page<Artist> getArtist(Pageable pageable);
    public Artist submitArtist(Artist artist);
    public Artist getArtistById(String idArtist);
    public Artist saveArtist(MultipartFile multipartFile, Artist artist);
}
