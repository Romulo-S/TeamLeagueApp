package com.br.launchersoft.leagueimport.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.service.TeamService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Controller
public class TeamMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private TeamService teamService;

    @MutationMapping
    public Team createTeam(@Argument String name,@Argument String address, @Argument String areaName,@Argument String shortName,@Argument String tla) {
        return teamService.createTeam(name, address, areaName, shortName, tla);
    }

    @MutationMapping
    public Team addPlayerToTeam(Long playerId, Long teamId) {
        return teamService.addPlayerToTeam(playerId, teamId);
    }
    @MutationMapping
    public Team addCoachToTeam(Long coachId, Long teamId) {
        return teamService.addCoachToTeam(coachId, teamId);
    }
}
