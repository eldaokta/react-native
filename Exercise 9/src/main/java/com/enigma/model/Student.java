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

    @ManyToOne
    @JoinColumn(name = "class_room_id")
    Room classRoom;

    //INI YG LAGI DIKERJAIN
    @ManyToMany
    @JoinTable(
            name = "student_subject",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    List <Subject> ssed;
    

    public Student() {
    }

    public Student(Integer id, String name, String birthPlace, Date birthDate, String gender, Room classRoom, List<Subject> ssed) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.gender = gender;
        this.classRoom = classRoom;
        this.ssed = ssed;
    }

    public List<Subject> getSsed() {
        return ssed;
    }

    public void setSsed(List<Subject> ssed) {
        this.ssed = ssed;
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

    public Room getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(Room classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", classRoom=" + classRoom.getId() + //tambah getTd karena manggil id nya bukan classroomnya
                '}';
    }

    public void setSsed(Subject subjectYgDidapat) {
    }
}
