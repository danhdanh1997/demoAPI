package com.example.demo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "userId")
    private Integer id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "parentId",referencedColumnName = "parentId", nullable = false,updatable = false, insertable = true)
    private Parent employee;
}