package com.enigma.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_subject")
public class StudentSubject {

    @Id
    @Column(name = "id")
    private Integer Id;


    //INI YG LAGI DIKERJAIN
    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    Subject subject;


    public StudentSubject() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }


    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "StudentSubject{" +
                "Id=" + Id +
                ", student=" + student +
                ", subject=" + subject +
                '}';
    }
}
