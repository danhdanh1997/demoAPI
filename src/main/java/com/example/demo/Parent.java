package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "parents")
@Getter
@Setter
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "parentId")
    private Integer id;

    @Column(name = "parent_name")
    private String name;

    @Column(name = "email")
    private String email;
}
