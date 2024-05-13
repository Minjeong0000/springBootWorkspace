package com.kh.member.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
    public String join() {
        System.out.println("MemberDao.join@@@@@@@@@@@@");
        return "MemberDao.join~~";
    }
}
