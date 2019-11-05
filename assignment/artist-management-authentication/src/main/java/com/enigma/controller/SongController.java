package com.enigma.controller;

import com.enigma.enitity.Song;
import com.enigma.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {
    @Autowired
    SongService songService;

    @CrossOrigin
    @GetMapping("/songs")
    public List<Song> getAllSong(){
        return songService.getListSong();
    }

    @CrossOrigin
    @PostMapping("/song")
    public Song saveSong(@RequestBody Song song){
        return songService.saveSong(song);
    }
}
