// Write your code here
package com.example.song;
import java.util.*;
import com.example.song.Song;

public interface SongRepository{
    ArrayList<Song> getallsongs();
    Song addSong(Song song);
    Song getSong(int songId);
    Song updateSong(int songId,Song song);
    void deleteSong(int songId);
}
