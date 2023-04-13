/*
 * You can use the following import statements
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.*;
 */

// Write your code here
package com.example.song.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;


import com.example.song.model.Song;
import com.example.song.repository.SongRepository;
import com.example.song.repository.SongJpaRepository;


@Service
public class SongJpaService implements SongRepository{
    @Autowired 
    private SongJpaRepository songJpaRepository;

	@Override
	public ArrayList<Song> getallsongs() {
	  List<Song> songLists=	songJpaRepository.findAll();
	  ArrayList<Song> songsList = new ArrayList<>(songLists);
	  return songsList;
	}

	@Override
	public Song addSong(Song song) {
		songJpaRepository.save(song);
		return song;
	}

	@Override
	public Song getSong(int songId) {
		try{
			Song song = songJpaRepository.findById(songId).get();
			return song;
		}catch(Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public Song updateSong(int songId, Song song) {
		try{

			Song existingSong = songJpaRepository.findById(songId).get();
			if(song.getLyricist()!=null){
				existingSong.setLyricist(song.getLyricist());
			}
			if(song.getMusicDirector()!=null){
				existingSong.setMusicDirector(song.getMusicDirector());
			}
			if(song.getSinger()!=null){
				existingSong.setSinger(song.getSinger());
			}
			if(song.getSongName()!=null){
				existingSong.setSongName(song.getSongName());
			}
			songJpaRepository.save(existingSong);
			return existingSong;
		}catch(Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public void deleteSong(int songId) {
		try{
		songJpaRepository.deleteById(songId);

		}catch(Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		
	}

}
