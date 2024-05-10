package com.kh.app.member.service;

import com.kh.app.member.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    //dao호출작업은 필드로 빼야함
    //메소드 실행할때마다 객체생성=>성능처하
    @Autowired
    private MemberDao dao;
    public MemberService(){
        System.out.println("MemberService.MemberService 호출됨");
    }


    public int join(){

        System.out.println("MemberService.join");
        int result = dao.join();
        return result;
    }


}
