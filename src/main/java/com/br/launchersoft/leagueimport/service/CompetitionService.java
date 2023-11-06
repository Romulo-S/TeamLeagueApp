package com.br.launchersoft.leagueimport.service;

import com.br.launchersoft.leagueimport.entity.Competition;
import com.br.launchersoft.leagueimport.repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for the entity Competition.
 *
 * @autor launchersoft
 * @see com.br.launchersoft.leagueimport.entity.Competition
 * @since 1.0
 * @version 1.0
 *
 */
@Service
public class CompetitionService {

    @Autowired
    private CompetitionRepository competitionRepository;

    public List<Competition> getAllCompetitions() {
        return competitionRepository.findAll();
    }

    public Optional<Competition> getCompetitionById(Long id) {
        return competitionRepository.findById(id);
    }

    public Competition saveCompetition(Competition competition) {
        return competitionRepository.save(competition);
    }

    public void deleteCompetition(Long id) {
        competitionRepository.deleteById(id);
    }
}
