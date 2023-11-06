package com.br.launchersoft.leagueimport.entity;

import java.time.LocalDate;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 *
 * Entity class for Coach table
 *
 * @since 1.0.0
 * @version 1.0.0
 * @author launchersoft
 *
 * @apiNote
 * This class is used to map the Coach table in the database.
 */
@Entity
@Data
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String nationality;
    
    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
