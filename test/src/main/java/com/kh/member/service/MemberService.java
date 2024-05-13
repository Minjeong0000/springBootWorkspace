package com.kh.member.service;

import com.kh.member.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired//의존성주입
    private MemberDao memberDao;

    public String join() {
        System.out.println("MemberService.join~~~~");
       return memberDao.join();

    }
}
