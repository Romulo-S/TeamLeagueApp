package com.br.launchersoft.leagueimport.resolver.query;

import com.br.launchersoft.leagueimport.entity.Player;
import com.br.launchersoft.leagueimport.service.PlayerService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

/**
 * Resolver for Player entity queries.
 * @author launchersoft
 * @since 1.0.0
 * @see com.br.launchersoft.leagueimport.entity.Player
 */
@Component
@RequiredArgsConstructor
public class PlayerQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private PlayerService playerService;

    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerService.getPlayerById(id);
    }
}
