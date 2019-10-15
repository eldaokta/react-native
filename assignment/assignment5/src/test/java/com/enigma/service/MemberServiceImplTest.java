package com.enigma.service;


import com.enigma.entities.Member;
import com.enigma.repositories.MemberRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceImplTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MemberService memberService;

    @Before
    public void cleanUp(){
        memberRepository.deleteAll();
    }

//    @Test
//    public void Member_save_expected_created(){
//        Member expected = new Member("Elda Oktaviani", "eldaoktaviani5@gmail.com", "Jl. Tanah Seratus");
//        expected = memberService.save(expected); //ngesave object yg diharapkan
//        Member realResult = memberRepository.findById(expected.getIdMember()).get();
//        assertEquals(expected, realResult);
//    }

//    @Test
//    public void
}
