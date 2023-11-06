package com.br.launchersoft.leagueimport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.br.launchersoft.leagueimport.entity.Coach;
import com.br.launchersoft.leagueimport.entity.Player;
import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.repository.CoachRepository;
import com.br.launchersoft.leagueimport.repository.PlayerRepository;
import com.br.launchersoft.leagueimport.repository.TeamRepository;

import jakarta.transaction.Transactional;

/**
 * Service class for the entity Team.
 *
 * @autor launchersoft
 * @see com.br.launchersoft.leagueimport.entity.Team
 * @since 1.0
 * @version 1.0
 *
 */
@Service
public class TeamService {

    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;
    private final CoachRepository coachRepository;

    public TeamService(TeamRepository teamRepository, PlayerRepository playerRepository, CoachRepository coachRepository) {
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
        this.coachRepository = coachRepository;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Transactional
    public Team addPlayerToTeam(Long playerId, Long teamId) {
        Team team = teamRepository.findById(teamId).orElseThrow(() -> new RuntimeException("Team not found"));
        Player player = playerRepository.findById(playerId).orElseThrow(() -> new RuntimeException("Player not found"));

        team.getPlayers().add(player);
        return teamRepository.save(team);
    }
    @Transactional
    public Team addCoachToTeam(Long coachId, Long teamId) {
        Team team = teamRepository.findById(teamId).orElseThrow(() -> new RuntimeException("Team not found"));
        Coach coach = coachRepository.findById(coachId).orElseThrow(() -> new RuntimeException("Coach not found"));

        team.setCoach(coach);
        return teamRepository.save(team);
    }

    public Optional<Team> getTeamById(Long id) {
        return teamRepository.findById(id);
    }

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }

    public Team createTeam(String name, String address, String areaName, String shortName, String tla) {
        Team team = new Team();
        team.setName(name);
        team.setAddress(address);
        team.setAreaName(areaName);
        team.setShortName(shortName);
        team.setTla(tla);
        return teamRepository.save(team);
    }
}
