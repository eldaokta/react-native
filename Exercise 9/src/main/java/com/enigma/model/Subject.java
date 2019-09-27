package com.enigma.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    private Integer id;

    @Column(name = "subject_name")
    private String subject_name;

    @Column(name = "sks")
    private String sks;

    //INI YG LAGI DIKERJAIN
    @ManyToMany(mappedBy = "ssed")
    List<Student> ss;

    public Subject() {
    }



}
