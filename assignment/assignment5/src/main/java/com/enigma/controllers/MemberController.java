package com.enigma.controllers;

import com.enigma.entities.Member;
import com.enigma.entities.Purchased;
import com.enigma.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/member")
    public Member saveMember(@RequestBody Member member){
        return memberService.save(member);
    }

    @GetMapping("/members")
    public List<Member> getAllMember(){
        return memberService.getAll();
    }

    //untuk delete
    @DeleteMapping("member/{idMember}")
    public void deleteMember(@PathVariable String idMember){
        memberService.deleteMember(idMember);
    }



}
