package com.br.launchersoft.leagueimport.mutation;

import com.br.launchersoft.leagueimport.entity.Coach;
import com.br.launchersoft.leagueimport.entity.Team;
import com.br.launchersoft.leagueimport.repository.CoachRepository;
import com.br.launchersoft.leagueimport.repository.TeamRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoachMutation implements GraphQLMutationResolver {

    @Autowired
    private CoachRepository coachRepository;

    @Autowired
    private TeamRepository teamRepository;

    public Coach createCoach(String name, Long teamId) {
        Team team = teamRepository.findById(teamId)
            .orElseThrow(() -> new RuntimeException("Team not found"));

        Coach coach = new Coach();
        coach.setName(name);
        coach.setTeam(team);

        return coachRepository.save(coach);
    }
}
