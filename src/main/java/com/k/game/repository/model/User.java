package com.k.game.repository.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {

    public User(){}

    public User(String password,String username,String firstName,String lastName){

        this.password=password;
        this.username=username;
        this.firstName=firstName;
        this.lastName=lastName;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Action> actions;

}
