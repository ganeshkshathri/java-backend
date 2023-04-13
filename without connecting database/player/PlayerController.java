/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.player.PlayerService;
@RestController
public class PlayerController{
    PlayerService playerService = new PlayerService();
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
