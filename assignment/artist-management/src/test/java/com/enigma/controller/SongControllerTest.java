package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repository.ArtistRepository;
import com.enigma.repository.SongRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class SongControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    SongRepository songRepository;

    @Test
    public void saveSong_return_OKStatus() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Song excepted = new Song( "menuju senja");

        mockMvc.perform(post("/song")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(excepted))).andExpect(status().isOk());
    }

    @Test
    public void saveSong_return_DB() throws Exception{

        ObjectMapper mapper = new ObjectMapper();
        Song excepted = new Song("menghitung hari");
        String response = mockMvc.perform(post("/song")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(excepted))).andReturn().getResponse().getContentAsString();
        excepted = new ObjectMapper().readValue(response, Song.class);
        Assert.assertEquals(excepted, songRepository.findById(excepted.getIdSong()).get());
    }

}
