package com.zf.world;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test {
    @GetMapping("user")
    public String user() {
        String aa = "aaa";
        System.out.println(aa);
        return "/ic/test";
    }
}
