package com.br.launchersoft.leagueimport.mutation;

import javax.annotation.Nonnull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.service.TeamService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class TeamMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private TeamService teamService;

    public Team createTeam(@Nonnull String name, String address, String areaName, String shortName, String tla) {
        return teamService.createTeam(name, address, areaName, shortName, tla);
    }


    public Team addPlayerToTeam(Long playerId, Long teamId) {
        return teamService.addPlayerToTeam(playerId, teamId);
    }

    public Team addCoachToTeam(Long coachId, Long teamId) {
        return teamService.addCoachToTeam(coachId, teamId);
    }
}
