// Write your code here
package com.example.song.model;

public class Song{
    private int songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;
    //constructor
    public Song(int songId,String songName,String lyricist,String singer,String musicDirector){
        this.songId=songId;
        this.songName=songName;
        this.lyricist=lyricist;
        this.singer=singer;
        this.musicDirector=musicDirector;
    }
    //getter and setter for songId
    public void setSongId(int songId){
        this.songId=songId;
    }
    public int getSongId(){
        return this.songId;
    }
    //getter and setter for songName
    public void setSongName(String songName){
        this.songName=songName;
    }
    public String getSongName(){
        return this.songName ;
    }
    //getter and setter for lyricist
    public void setLyricist(String lyricist){
        this.lyricist=lyricist;
    }
    public String getLyricist(){
        return this.lyricist ;
    }
    //getter and setter for singer
    public void setSinger(String singer){
        this.singer=singer;
    }
    public String getSinger(){
        return this.singer ;
    }
    //getter and setter for songName
    public void setMusicDirector(String musicDirector){
        this.musicDirector=musicDirector;
    }
    public String getMusicDirector(){
        return this.musicDirector ;
    }
    
}