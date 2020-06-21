package com.example.sample.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Person")
@Getter
@Setter
@NoArgsConstructor
public class PersonEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String fname;
    private String lastName;
    private String email;

}
