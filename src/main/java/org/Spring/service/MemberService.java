package org.Spring.service;

import org.Spring.domain.Member;
import org.Spring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member save(Member member) {
        return memberRepository.save(member);
    }

    public Member findById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        memberRepository.deleteById(id);
    }

    public Member update(Member member) {
        return memberRepository.save(member);
    }
}
