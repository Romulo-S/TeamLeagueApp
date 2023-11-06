package com.br.launchersoft.leagueimport.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

/**
 * Entity class for Team table
 *
 * @since 1.0.0
 * @version 1.0.0
 * @see Player
 * @author launchersoft
 * @apiNote
 * This class is used to map the Team table in the database.
 */
@Entity
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String tla;
    private String shortName;
    private String areaName;
    private String address;
    
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;
    
    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    private Coach coach;

    // Relação muitos para muitos entre Times e Competição
    @ManyToMany(mappedBy = "teams")
    private List<Competition> competitions = new ArrayList<>();
}
