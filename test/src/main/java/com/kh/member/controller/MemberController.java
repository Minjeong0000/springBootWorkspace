package com.kh.member.controller;

import com.kh.member.dao.MemberDao;
import com.kh.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("member")//공통주소
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("join")
    public String join(){
        System.out.println("MemberController.join!!!!!!!!!!!!!!!");
        return memberService.join();

    }


}
