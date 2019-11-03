package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.repository.ArtistRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ArtistControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ArtistRepository artistRepository;

    @Test
    public void saveArtist_return_OKStatus() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Artist excepted = new Artist("susi store", "jakarta");

        mockMvc.perform(post("/save-artist")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(excepted))).andExpect(status().isOk());
    }

    @Test
    public void saveArtist_return_DB() throws Exception{

        ObjectMapper mapper = new ObjectMapper();
        Artist excepted = new Artist("susi store", "jakarta");
        String response = mockMvc.perform(post("/save-artist")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(excepted))).andReturn().getResponse().getContentAsString();
        excepted = new ObjectMapper().readValue(response, Artist.class);
        Assert.assertEquals(excepted, artistRepository.findById(excepted.getId()).get());
    }

}