package com.enigma.service;

import com.enigma.entities.Member;
import com.enigma.entities.Product;
import com.enigma.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public Member save(Member member) {
        memberRepository.save(member);
        return member;
    }

//    @Override
//    public Member getMember(String idMember) {
//        if (!memberRepository.findById(idMember).isPresent()){
//            return new Member();
//        }
//        return memberRepository.findById(idMember).get();
//    }

    @Override
    public List<Member> getAll() {
        return memberRepository.findAll();
    }

    @Override
    public void deleteMember(String idMember) {
        memberRepository.deleteById(idMember);
    }
}
