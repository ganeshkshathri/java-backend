/*
 * You can use the following import statements
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.jdbc.core.JdbcTemplate;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.player.service;
import com.example.player.repository.PlayerRepository;
import com.example.player.model.Player;
import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.player.model.PlayerRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;


@Service
public class PlayerH2Service implements PlayerRepository{
    @Autowired
    private JdbcTemplate db;
    @Override 
    public ArrayList<Player> getPlayerList(){
        List<Player> playerList = db.query("SELECT * FROM TEAM",new PlayerRowMapper());
        ArrayList<Player> PlayersLists = new ArrayList<>(playerList);
        return PlayersLists;

    }
    @Override
    public Player getplayer(int playerId){
        try{
    Player player = db.queryForObject("Select * from TEAM where playerId = ?",new PlayerRowMapper(),playerId);
    return player;
    }catch(Exception e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    
    }
    @Override
    public Player addPlayer(Player player){
        db.update("insert into TEAM(playerName,jerseyNumber,role) values (?,?,?)",player.getPlayerName(), player.getJerseyNumber(),player.getRole());
        Player savedPlayer= db.queryForObject("select * from TEAM where playerName = ? and jerseyNumber = ? and role = ?", new PlayerRowMapper(), player.getPlayerName(), player.getJerseyNumber(),player.getRole());
        return savedPlayer;
    }
    @Override
    public Player updateplayer(int playerId,Player player){
        if(player.getPlayerName()!=null){
        db.update("update TEAM set playerName = ? where playerId =?", player.getPlayerName(),playerId);
        }
        if(Integer.toString(player.getJerseyNumber())!=null){
        db.update("update TEAM set jerseyNumber = ? where playerId =?", player.getJerseyNumber(),playerId);
        }
        if(player.getRole()!=null){
            db.update("update TEAM set role = ? where playerId = ?", player.getRole(),playerId);
        }
        return getplayer(playerId);
    }
    @Override
    public void deleteplayer(int playerId){
        db.update("delete from TEAM where playerId = ?", playerId);
    }
     

}