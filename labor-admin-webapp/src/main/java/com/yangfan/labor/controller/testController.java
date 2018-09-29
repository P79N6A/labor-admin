package com.yangfan.labor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leo01.zhu on 2018/9/29.
 */
@RestController
public class testController {

    @ResponseBody
    @RequestMapping("/greeting")
    public String hello(){
        return "hello";
    }
}