// Write your code here
package com.example.player.repository;
import java.util.ArrayList;
import com.example.player.model.*;
public interface PlayerRepository{
    ArrayList<Player> getPlayerList();
    Player addPlayer(Player player);
    Player getplayer(int playerId);
    Player updateplayer(int playerId,Player player);
    void deleteplayer(int playerId);
}