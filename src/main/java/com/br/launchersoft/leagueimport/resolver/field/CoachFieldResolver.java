package com.br.launchersoft.leagueimport.resolver.field;

import com.br.launchersoft.leagueimport.entity.Coach;
import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.repository.TeamRepository;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class CoachFieldResolver implements GraphQLResolver<Coach> {
    
    @Autowired
    private TeamRepository teamRepository;

    public Team getTeam(Coach coach) {
        return teamRepository.findById(coach.getTeam().getId()).orElse(null);
    }
}
