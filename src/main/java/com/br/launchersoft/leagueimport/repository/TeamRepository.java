package com.br.launchersoft.leagueimport.repository;

import java.util.List;

import com.br.launchersoft.leagueimport.entity.Competition;
import com.br.launchersoft.leagueimport.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para a entidade Team.
 *
 * @autor launchersoft
 * @see com.br.launchersoft.leagueimport.entity.Team
 * @since 1.0
 * @version 1.0
 *
 */
public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findByCompetitionsContains(Competition competition);
}
