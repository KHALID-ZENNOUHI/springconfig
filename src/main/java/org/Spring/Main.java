package org.Spring;

import org.Spring.domain.Member;
import org.Spring.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MemberService memberService = context.getBean(MemberService.class);
        Member member1 = new Member(null,"123", "John", "Doe", "123456", "USA", LocalDate.now(), LocalDate.now().plusYears(1));
        memberService.save(member1);
        Member member2 = new Member();
        member2.setMembershipNumber("456");
        member2.setFirstName("Jane");
        member2.setLastName("Doe");
        member2.setIdDocument("654321");
        member2.setNationality("USA");
        member2.setMembershipDate(LocalDate.now());
        member2.setLicenseExpiryDate(LocalDate.now().plusYears(2));
        memberService.save(member2);
        Member member3 = Member.builder().
                                membershipNumber("789").
                                firstName("Alice").
                                lastName("Doe").
                                idDocument("789123").
                                nationality("USA").
                                membershipDate(LocalDate.now()).
                                licenseExpiryDate(LocalDate.now().plusYears(3))
                                .build();
        memberService.save(member3);
        memberService.findAll().forEach(System.out::println);
    }
}