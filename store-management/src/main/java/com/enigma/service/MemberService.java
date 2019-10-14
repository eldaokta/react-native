package com.enigma.service;

import com.enigma.entities.Member;

import java.util.List;

public interface MemberService {
    public Member save(Member member);

//    public Member getMember(String idMember);

    public List<Member> getAll();

    public void deleteMember(String idMember);

}
