package com.br.launchersoft.leagueimport.repository;

import java.util.List;

import com.br.launchersoft.leagueimport.entity.Competition;
import com.br.launchersoft.leagueimport.entity.Team;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para a entidade Competition.
 *
 * @autor launchersoft
 * @see com.br.launchersoft.leagueimport.entity.Competition
 * @since 1.0
 * @version 1.0
 *
 */
public interface CompetitionRepository extends JpaRepository<Competition, Long> {
    List<Competition> findByTeamsContains(Team team);
}
