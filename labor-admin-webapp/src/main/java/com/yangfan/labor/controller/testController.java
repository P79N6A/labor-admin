package com.yangfan.labor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yangfan.labor.service.OubShipmentHeaderService;

/**
 * Created by leo01.zhu on 2018/9/29.
 */
@RestController
public class testController {

    @Autowired
    private OubShipmentHeaderService oubShipmentHeaderService;

    @ResponseBody
    @RequestMapping("/greeting")
    public String hello() {

        return oubShipmentHeaderService.hello();
    }
}