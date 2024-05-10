package com.kh.app.member.controller;


import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberService ms;

    public MemberController(){
        System.out.println("MemberController.MemberController 생성자 호출됨");

    }

    @GetMapping("join")
    public void join(){
        System.out.println("MemberController.join");

        int result = ms.join();
        System.out.println("result = " + result);
    }
    @GetMapping("login")
    public void login(){
        System.out.println("MemberController.login");
    }

    @GetMapping("edit")
    public void edit(){
        System.out.println("MemberController.edit");
    }
    @GetMapping("quit")
    public void quit(){
        System.out.println("MemberController.quit");

    }




}
