package com.enigma.repositories;

import com.enigma.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReporsitory extends JpaRepository<Student, Integer> {

}
