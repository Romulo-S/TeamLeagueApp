package com.br.launchersoft.leagueimport.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.launchersoft.leagueimport.entity.Player;
import com.br.launchersoft.leagueimport.repository.PlayerRepository;

/**
 * Service class for the entity Player.
 *
 * @autor launchersoft
 * @see com.br.launchersoft.leagueimport.entity.Player
 * @since 1.0
 * @version 1.0
 *
 */
@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }

    public List<Player> getPlayersByTeamId(Long teamId) {
        return playerRepository.findByTeamId(teamId);
    }

    public Player createPlayer(String name, String position, LocalDate dateOfBirth, String nationality) {
        Player player = new Player();
        player.setName(name);
        player.setPosition(position);
        player.setDateOfBirth(dateOfBirth);
        player.setNationality(nationality);
        return playerRepository.save(player);
    }
}
