/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.song;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;
import com.example.song.Song;

@RestController
public class SongController{
    SongService songService=new SongService();

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

