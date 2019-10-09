package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repositories.ArtistRepository;
import com.enigma.repositories.SongRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/song")
    public String toSongList(Model model){
        List<Song> listSong = songRepository.findAll();
        model.addAttribute("listSong", listSong);
        return "/song/song-view";
    }

    @GetMapping("/song/song-form")
    public ModelAndView toSongForm(Model model){
        List<Artist> artists = artistRepository.findAll();
        model.addAttribute("artistList", artists);
        return new ModelAndView("/song/song-form", "song", new Song());
    }

    @PostMapping("/song")
    public String submitSong(@ModelAttribute("song") Song song){
        songRepository.save(song);
        return "redirect:/song";
    }




}
