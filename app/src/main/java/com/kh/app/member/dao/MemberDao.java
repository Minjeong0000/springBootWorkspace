package com.kh.app.member.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

    public MemberDao() {
        System.out.println("MemberDao.MemberDao 생성자 호출됨@@@@@@");
    }

    public int join(){
        System.out.println("MemberDao.join called");
        //sql
        return 1;
    }

}
