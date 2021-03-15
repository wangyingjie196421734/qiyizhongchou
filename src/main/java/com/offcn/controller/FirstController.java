package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    //修改
    //访问某个地址
    //把数据填充到访问地址页面上
    @GetMapping("/first")
    public String index(Model model){
        String msg = "杰少好帅!!!";
        model.addAttribute("msg",msg);
        return "index";
    }
}
