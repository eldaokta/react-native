package com.enigma.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_subject")
public class StudentSubject {

    @Id
    private Integer Id;

    @Column(name = "student_id")
    private Integer StudentId;

    @Column(name = "subject_id")
    private Integer SubjectId;

    @ManyToMany(mappedBy = "student_subject")
    List<Student> StudentSubject;

    public StudentSubject() {
    }

    public StudentSubject(Integer id, Integer studentId, Integer subjectId) {
        Id = id;
        StudentId = studentId;
        SubjectId = subjectId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public Integer getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(Integer subjectId) {
        SubjectId = subjectId;
    }

    @Override
    public String toString() {
        return "StudentSubject{" +
                "Id=" + Id +
                ", StudentId=" + StudentId +
                ", SubjectId=" + SubjectId +
                '}';
    }
}
