package com.kalamba.game.repository.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "game")
public class Game {

    public Game(){}

    public Game(String name,String code,String description){
        this.name=name;
        this.code=code;
        this.description=description;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<Action> actions;
}
