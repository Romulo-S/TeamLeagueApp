package com.br.launchersoft.leagueimport.resolver.field;

import com.br.launchersoft.leagueimport.entity.Player;
import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.repository.TeamRepository;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class PlayerFieldResolver implements GraphQLResolver<Player> {
    
    @Autowired
    private TeamRepository teamRepository;

    public Team getTeam(Player player) {
        return player.getTeam();
    }

    public String getTeamName(Player player) {
        return player.getTeam().getName();
    }
}
