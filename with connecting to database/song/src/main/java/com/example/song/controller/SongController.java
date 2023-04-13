/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here

/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.song.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.song.model.Song;
import com.example.song.service.SongH2Service;

import java.util.*;

@RestController
public class SongController{
    @Autowired
    SongH2Service songService;

    @GetMapping("/songs")
    public ArrayList<Song> getAllSongs(){
        return songService.getallsongs();
    }
    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return songService.addSong(song);
    }
    @GetMapping("/songs/{songId}")
    public Song getSong(@PathVariable("songId") int songId){
        return songService.getSong(songId);
    }
    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId,@RequestBody Song song){
        return songService.updateSong(songId,song);
    }
    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable int songId){
        songService.deleteSong(songId);
    }
}

