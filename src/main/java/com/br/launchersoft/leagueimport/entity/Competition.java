package com.br.launchersoft.leagueimport.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

/**
 * Entity class for Competition table
 *
 * @since 1.0.0
 * @version 1.0.0
 * @apiNote
 * This class is used to map the Competition table in the database.
 *
 * @author launchersoft
 * @see Team
 */
@Entity
@Data
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private String areaName;

    // Relação muitos para muitos entre Competição e Times
    @ManyToMany
    @JoinTable(
        name = "competition_team",
        joinColumns = @JoinColumn(name = "competition_id"),
        inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    private List<Team> teams = new ArrayList<>();
}
