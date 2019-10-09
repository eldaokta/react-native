package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ArtistController {
    @Autowired
    ArtistRepository artistRepository;

    @GetMapping("/artist")
    public String toArtistList(Model model){
        List<Artist> artistList = artistRepository.findAll();
        model.addAttribute("artistList", artistList);
        return "artist-view";
    }
    @GetMapping("artist-form")
    public ModelAndView toArtistForm(){
        return new ModelAndView("artist-form", "artist", new Artist());
    }

    @PostMapping("artist-form")
    public String submitArtist(@ModelAttribute("artist") Artist artist){
        artistRepository.save(artist);
        return "redirect:/artist";
    }

    @GetMapping("/detail")
    public ModelAndView getDetail(@RequestParam Integer id, Model model){
        Artist artist = artistRepository.getOne(id);
        return new ModelAndView("artist-form", "artist", artist);
    }




}
