package com.enigma.service;
import com.enigma.entity.Song;
import com.enigma.repository.SongRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class SongServiceImplTest {

    @Autowired
    SongRepository songRepository;

    @Autowired
    SongService songService;

    @Test
    public void Song_GetById_when_IdExist(){
        Song expcepted = new Song("senja disore hari");
        expcepted = songService.saveSong(expcepted);
        Song newSong = songRepository.findById(expcepted.getIdSong()).get();
        assertEquals(expcepted, newSong);
    }

    @Test
    public void Song_getAllSong_Should_true_whenSizeEquals_2(){
        Song expcepted = new Song("senja disore hari");
        Song expcepted1 = new Song("senja disore hari");
        songService.saveSong(expcepted);
        songService.saveSong(expcepted1);

        assertEquals(2, songRepository.findAll().size());
    }

}