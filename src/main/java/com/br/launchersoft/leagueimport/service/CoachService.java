package com.br.launchersoft.leagueimport.service;

import com.br.launchersoft.leagueimport.entity.Coach;
import com.br.launchersoft.leagueimport.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for the entity Coach.
 *
 * @autor launchersoft
 * @see com.br.launchersoft.leagueimport.entity.Coach
 * @since 1.0
 * @version 1.0
 *
 */
@Service
public class CoachService {

    @Autowired
    private CoachRepository coachRepository;

    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }

    public Optional<Coach> getCoachById(Long id) {
        return coachRepository.findById(id);
    }

    public Coach saveCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    public void deleteCoach(Long id) {
        coachRepository.deleteById(id);
    }
}
