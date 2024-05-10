package com.kh.jmj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@CrossOrigin
public class HelloWorld {

    @GetMapping("hello")//hello란 요청이 왔을 때 동작하는 메서드
    @ResponseBody//문자열내보내기 어노테이션
    public String m01(){
        System.out.println("HelloWorld.m01 called~~~~~~~~~~~~~~");
//        response.getWriter().write("~~");
            return "<h1>zzzzzzzzzzzzzzzzzzz from spring<h1>";
    }

}
