package com.br.launchersoft.leagueimport.resolver.query;

import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.service.TeamService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TeamQueryResolver implements GraphQLQueryResolver {

    private final TeamService teamService;

    @QueryMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @QueryMapping
    public Optional<Team> getTeamById(@Argument Long id) {
        return teamService.getTeamById(id);
    }
}
