package com.ll.sb20211114;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody // 이 함수의 리턴값을 그대로 브라우저에 전송해
    String showMain(){
        return "안녕하세요.";
    }
    @GetMapping("/about")
    @ResponseBody
    String showAbout(){
        return "개발자커뮤니티";
    }
}
