package com.enigma.repositories;

import com.enigma.entities.Member;
import com.enigma.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

}
