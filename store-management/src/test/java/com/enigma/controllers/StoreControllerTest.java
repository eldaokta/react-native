package com.enigma.controllers;

import com.enigma.entities.Store;
import com.enigma.repositories.StoreRepository;
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

import javax.websocket.SendResult;

import static org.springframework.http.ResponseEntity.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StoreControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    StoreRepository storeRepository;

    @Test
    public void saveStore_should_return_OKStatus() throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Store expected = new Store("Another Store", "Jl.Ninja", "kami menjual suriken second", "081317181920");

        mockMvc.perform(post("/store")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(expected)));
    }

    @Test
    public void saveStore_should_existInDB()throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Store expected = new Store("Another Store", "Jl.Ninja", "kami menjual suriken second", "081317181920");
        String response = mockMvc.perform(post("/store")
                .contentType(MediaType.APPLICATION_JSON)
        .content(mapper.writeValueAsString(expected))).andReturn().getResponse().getContentAsString();

        expected = new ObjectMapper().readValue(response, Store.class);

        Assert.assertEquals(expected, storeRepository.findById(expected.getId()).get());
    }


}
