package com.br.launchersoft.leagueimport.mutation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.launchersoft.leagueimport.entity.Competition;
import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.repository.CompetitionRepository;
import com.br.launchersoft.leagueimport.repository.TeamRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

/**
 * Mutation class for Competition entity
 *
 * @since 1.0
 * @version 1.0
 * @see Competition
 * @author launchersoft
 */
@Component
public class CompetitionMutation implements GraphQLMutationResolver {

    @Autowired
    private CompetitionRepository competitionRepository;

    @Autowired
    private TeamRepository teamRepository;

    public Competition createCompetition(String name) {
        Competition competition = new Competition();
        competition.setName(name);

        return competitionRepository.save(competition);
    }

    public Competition addTeamToCompetition(Long teamId, Long competitionId) {
        Team team = teamRepository.findById(teamId)
            .orElseThrow(() -> new RuntimeException("Team not found"));

        Competition competition = competitionRepository.findById(competitionId)
            .orElseThrow(() -> new RuntimeException("Competition not found"));

        List<Team> teams = competition.getTeams();
        if(teams == null) {
            teams = new ArrayList<>();
            competition.setTeams(teams);
        }
        teams.add(team);

        return competitionRepository.save(competition);
    }
}
