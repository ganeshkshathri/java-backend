// Write your code here.
package com.example.player.model;
public class Player{
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    //constructor for player class
    public Player(int playerId,String playerName,int jerseyNumber,String role){
        this.playerId=playerId;
        this.playerName=playerName;
        this.jerseyNumber=jerseyNumber;
        this.role=role;
    }

    //getter and setters for playerId
    
    public int getPlayerId(){
        return this.playerId;
    }
    public void setPlayerId(int playerId){
        this.playerId=playerId;
    } 
    //getters and setteres for playerName
    public String getPlayerName(){
        return this.playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName=playerName;
    }
    //getters and setters for jerseynumber
    public int getJerseyNumber(){
        return this.jerseyNumber;
    }
    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber=jerseyNumber;
    }
    //getters and setters for role
     public String getRole(){
        return this.role;
    }
    public void setRole(String role){
        this.role=role;
    }
}