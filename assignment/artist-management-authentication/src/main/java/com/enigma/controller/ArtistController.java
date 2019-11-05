package com.enigma.controller;

import com.enigma.enitity.Artist;
import com.enigma.service.ArtistService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class ArtistController {
    public static final String uploadPicture = System.getProperty("user.dir")+"/src/main/java/com/enigma/image/";

    @Autowired
    ArtistService artistService;

    @Autowired
    ObjectMapper objectMapper;

    @CrossOrigin
    @GetMapping("/artists")
    public Page<Artist> getArtists(@RequestParam Integer page, @RequestParam Integer size){
        Pageable pageable = PageRequest.of(page,size);
        return artistService.getArtist(pageable);
    }

    @CrossOrigin
    @PostMapping("/save-artist")
    public Artist InputDataArtist(@RequestPart MultipartFile picture, @RequestPart String artist) throws IOException{
        Artist artist1 = artistService.inputArtist(objectMapper.readValue(artist, Artist.class));
        try {
            byte[] bytes = picture.getBytes();
            Path path = Paths.get("E:\\Academy\\assignment\\assignment7\\src\\image\\" + artist1.getIdArtist()+".jpg");
            Files.write(path, bytes);
        }catch (IOException e){
            e.printStackTrace();
        }
        return artist1;
    }

    @PostMapping("/save")
    public Artist saveArtist(@RequestBody Artist artist){
        return artistService.inputArtist(artist);
    }

    @GetMapping("artist/{idArtist}")
    public Artist getArtistById(@PathVariable String idArtist){
        return artistService.getArtistById(idArtist);
    }


}
