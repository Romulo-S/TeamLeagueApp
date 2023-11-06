package com.br.launchersoft.leagueimport.resolver.field;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.launchersoft.leagueimport.entity.Competition;
import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.repository.TeamRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class CompetitionFieldResolver implements GraphQLResolver<Competition> {
    
    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getTeams(Competition competition) {
        return teamRepository.findByCompetitionsContains(competition);
    }
}
