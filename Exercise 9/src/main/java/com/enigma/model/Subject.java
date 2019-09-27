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

//    //INI YG LAGI DIKERJAIN
    @OneToMany(mappedBy = "subject")
    List<StudentSubject> studentSubjects;

    public Subject() {
    }

    public Subject(Integer id, String subject_name, String sks, List<StudentSubject> studentSubjects) {
        this.id = id;
        this.subject_name = subject_name;
        this.sks = sks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public List<StudentSubject> getStudentSubjects() {
        return studentSubjects;
    }

    public void setStudentSubjects(List<StudentSubject> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }
}
