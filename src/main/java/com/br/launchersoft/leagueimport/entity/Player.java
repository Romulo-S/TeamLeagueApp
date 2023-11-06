package com.br.launchersoft.leagueimport.entity;

import java.time.LocalDate;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Entity class for Player table
 *
 * @since 1.0.0
 * @version 1.0.0
 * @apiNote
 * This class is used to map the Player table in the database.
 *
 * @author launchersoft
 */
@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String position;
    private LocalDate dateOfBirth;
    private String nationality;
    
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
