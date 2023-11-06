package com.br.launchersoft.leagueimport.resolver.query;

import com.br.launchersoft.leagueimport.entity.Coach;
import com.br.launchersoft.leagueimport.service.CoachService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CoachQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private CoachService coachService;

    public List<Coach> getAllCoaches() {
        return coachService.getAllCoaches();
    }

    public Optional<Coach> getCoachById(Long id) {
        return coachService.getCoachById(id);
    }
}
