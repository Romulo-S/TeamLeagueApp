package com.br.launchersoft.leagueimport.mutation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.launchersoft.leagueimport.entity.Player;
import com.br.launchersoft.leagueimport.service.PlayerService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class PlayerMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private PlayerService playerService;

    public Player createPlayer(String name, String position, LocalDate dateOfBirth, String nationality) {
        return playerService.createPlayer(name, position, dateOfBirth, nationality);
    }
}
