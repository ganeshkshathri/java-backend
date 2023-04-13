/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.player.model.Player;
import com.example.player.service.PlayerH2Service;

import java.util.*;
@RestController
public class PlayerController{
    @Autowired
    public PlayerH2Service playerService;
    @GetMapping("/players")
    public ArrayList<Player> getplayerList(){
        return playerService.getPlayerList();
    }
    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }
    @GetMapping("/players/{playerId}")
    public Player getplayer(@PathVariable("playerId") int playerId){
        return playerService.getplayer(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updateplayer(@PathVariable("playerId") int playerId,@RequestBody Player player){
        return playerService.updateplayer(playerId,player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deleteplayer(@PathVariable("playerId") int playerId){
        playerService.deleteplayer(playerId);
    }
}
