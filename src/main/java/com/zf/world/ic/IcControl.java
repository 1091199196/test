package com.zf.world.ic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IcControl {
    @GetMapping("HIg")
    public void HIG() {
        System.out.println("00");
        System.out.println("0000");
    }
}