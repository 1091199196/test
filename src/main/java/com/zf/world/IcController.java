package com.zf.world;

import com.zf.world.ic.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class IcController {

    @GetMapping("/test")
    public String first() {
        System.out.println("0000");
        return "/ic/test.html";
    }

    @GetMapping("/index")
    @ResponseBody
    public User index() {
        User user = new User();
        user.setUserName("祖万里");
        user.setUserAge("11");
        user.setBirthday(new Date());
        return user;
    }


}