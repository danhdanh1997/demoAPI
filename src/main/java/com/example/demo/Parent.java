package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "parents")
@Getter
@Setter
public class Parent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "parentId")
    private Integer id;

    @Column(name = "parent_name")
    private String name;

    @Column(name = "email")
    private String email;
}
