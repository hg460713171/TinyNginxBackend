package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/webapp")
public class HsLoginController {

    @PostMapping(value = "/home/dologin")
    public String doLogin(){
        try {

        }catch (Exception e){
            System.out.println("2");

        }
        System.out.println("3");
        return "1231231";
    }
    @PostMapping(value = "/getInfo")
    public void getInfo(){
        HttpServletRequest request =  ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();;
        request.getCookies();

    }



    //我们可以使用postman进行调用测试 登录前后hello的区别
    @PostMapping(value = "/hello")
    public String hello(HttpServletRequest request){
        //Cookie[] cookies = request.getCookies();
       // System.out.println(cookies[0].getValue());
        return "hello";
    }
    //用来设置未登录用户跳转的方法
    @GetMapping(value = "/login")
    public String login(){
        return "Please Login !";
    }
    //注销方法
    @GetMapping(value = "/logout")
    public String logout(){
//        Subject subject = SecurityUtils.getSubject();
//        subject.logout();
//        System.out.println("成功退出");

        return "success to logouRt";
    }
}
