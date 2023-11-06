package com.br.launchersoft.leagueimport.resolver.query;

import com.br.launchersoft.leagueimport.entity.Competition;
import com.br.launchersoft.leagueimport.service.CompetitionService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CompetitionQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private CompetitionService competitionService;

    public List<Competition> getAllCompetitions() {
        return competitionService.getAllCompetitions();
    }

    public Optional<Competition> getCompetitionById(Long id) {
        return competitionService.getCompetitionById(id);
    }
}
