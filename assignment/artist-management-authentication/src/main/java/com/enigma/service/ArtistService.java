package com.enigma.service;

import com.enigma.enitity.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

public interface ArtistService {
    public Page<Artist> getArtist(Pageable pageable);
    public Artist inputArtist(Artist artist);
    public Artist getArtistById(String idArtist);
    public Artist saveArtist(MultipartFile multipartFile, Artist artist);
}
