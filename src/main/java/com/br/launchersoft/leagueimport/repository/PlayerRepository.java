package com.br.launchersoft.leagueimport.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.launchersoft.leagueimport.entity.Player;
import com.br.launchersoft.leagueimport.entity.Team;

/**
 * Repositório para a entidade Player.
 *
 * @autor launchersoft
 * @see com.br.launchersoft.leagueimport.entity.Player
 * @since 1.0
 * @version 1.0
 *
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByTeamId(Long teamId);
    List<Player> findByTeam(Team team);
}
