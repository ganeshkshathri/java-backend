
package com.example.song.repository;
import java.util.*;
import com.example.song.model.Song;

public interface SongRepository{
    ArrayList<Song> getallsongs();
    Song addSong(Song song);
    Song getSong(int songId);
    Song updateSong(int songId,Song song);
    void deleteSong(int songId);
}
