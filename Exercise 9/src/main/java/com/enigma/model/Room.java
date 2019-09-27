package com.enigma.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "room")
public class Room {
    @Id
    private Integer id;

    @Column(name = "roomName")
    private String roomName;

    @Column(name = "capacity")
    private Integer capacity;
    //mappebBy seperti on di join, tapi disini nama fieldnya yg di student
    @OneToMany(mappedBy = "classRoom")
    private List<Student> students;

    public Room() {
    }

    public Room(Integer id, String roomName, Integer capacity) {
        this.id = id;
        this.roomName = roomName;
        this.capacity = capacity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}
