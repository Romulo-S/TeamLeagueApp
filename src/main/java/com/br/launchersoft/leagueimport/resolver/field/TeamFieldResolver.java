package com.br.launchersoft.leagueimport.resolver.field;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.launchersoft.leagueimport.entity.Coach;
import com.br.launchersoft.leagueimport.entity.Competition;
import com.br.launchersoft.leagueimport.entity.Player;
import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.repository.CoachRepository;
import com.br.launchersoft.leagueimport.repository.CompetitionRepository;
import com.br.launchersoft.leagueimport.repository.PlayerRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 * Resolver for Team entity fields.
 * @since 1.0.0
 * @version 1.0.0
 * @see com.br.launchersoft.leagueimport.entity.Team
 */
@Component
public class TeamFieldResolver implements GraphQLResolver<Team> {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private CoachRepository coachRepository;

    @Autowired
    private CompetitionRepository competitionRepository;

    public List<Player> getPlayers(Team team) {
        return playerRepository.findByTeam(team);
    }

    public Coach getCoach(Team team) {
        return coachRepository.findByTeam(team);
    }

    public List<Competition> getCompetitions(Team team) {
        return competitionRepository.findByTeamsContains(team);
    }
}
