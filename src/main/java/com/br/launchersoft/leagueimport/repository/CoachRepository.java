package com.br.launchersoft.leagueimport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.launchersoft.leagueimport.entity.Coach;
import com.br.launchersoft.leagueimport.entity.Team;

/**
 * Repositório para a entidade Coach.
 *
 * @autor launchersoft
 * @see com.br.launchersoft.leagueimport.entity.Coach
 * @since 1.0
 * @version 1.0
 *
 */
public interface CoachRepository extends JpaRepository<Coach, Long> {
    Coach findByTeam(Team team);
}
