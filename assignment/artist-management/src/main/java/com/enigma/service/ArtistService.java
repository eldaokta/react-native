package com.enigma.service;

import com.enigma.entity.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ArtistService {
    public Page<Artist> getArtis(Pageable pageable);
    public Artist inputArtist(Artist artist);
    public Artist getArtistById(String id);
    public Artist saveArtist(MultipartFile multipartFile, Artist artist);

}
