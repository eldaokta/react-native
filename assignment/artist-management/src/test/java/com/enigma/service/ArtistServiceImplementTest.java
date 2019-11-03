package com.enigma.service;

import com.enigma.entity.Artist;
import com.enigma.repository.ArtistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArtistServiceImplementTest {

    @Autowired
    ArtistRepository artistRepository;
    @Autowired
    ArtistService artistService;

    @Test
    public void Artist_save_exception_created(){
        Artist expcepted = new Artist("susi cahyati", "lampung");
        expcepted = artistService.inputArtist(expcepted);
        expcepted.setId(expcepted.getId()); // penting ketika dalam method save terdapat logic lain (ex. set quantity/ apapun)
        Artist realproduct = artistRepository.findById(expcepted.getId()).get();
        assertEquals(expcepted,realproduct);
    }
    @Test
    public void Artist_GetById_when_IdExist(){
        Artist expcepted = new Artist("susi cahyati", "lampung");
        expcepted = artistService.inputArtist(expcepted);
        Artist newArtist = artistRepository.findById(expcepted.getId()).get();
        assertEquals(expcepted, newArtist);
    }

    @Test
    public void Artist_getAllArtist_Should_true_whenSizeEquals_2(){
        Artist newArtist = new Artist("susi cahyati", "lampung");
        Artist newArtist1 = new Artist("susi cahyati", "lampung");
        artistService.inputArtist(newArtist);
        artistService.inputArtist(newArtist1);

        assertEquals(2, artistRepository.findAll().size());
    }


}