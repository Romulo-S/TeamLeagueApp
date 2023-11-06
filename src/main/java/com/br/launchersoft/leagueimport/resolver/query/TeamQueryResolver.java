package com.br.launchersoft.leagueimport.resolver.query;

import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.service.TeamService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TeamQueryResolver implements GraphQLQueryResolver {

    private final TeamService teamService;

    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    public Optional<Team> getTeamById(Long id) {
        return teamService.getTeamById(id);
    }
}
