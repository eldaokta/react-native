package com.enigma.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_place")
    private String birthPlace;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "gender")
    private String gender;

//    @OneToMany
//    @JoinColumn(name = "class_room_id")
//    Room classRoom;

    //INI YG LAGI DIKERJAIN
    @OneToMany(mappedBy = "student") //nama atribut varibale yg ada di file sebelah yg di bawah
    private List<StudentSubject> studentSubjects;



    public Student() {
    }

    public Student(Integer id, String name, String birthPlace, Date birthDate, String gender, Room classRoom, List<StudentSubject> studentSubjects) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.gender = gender;
//        this.classRoom = classRoom;
        this.studentSubjects = studentSubjects;
    }

    public List<StudentSubject> getStudentSubjects() {
        return studentSubjects;
    }

    public void setStudentSubjects(List<StudentSubject> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public Room getClassRoom() {
//        return classRoom;
//    }
//
//    public void setClassRoom(Room classRoom) {
//        this.classRoom = classRoom;
//    }


}
