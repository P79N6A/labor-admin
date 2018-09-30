package com.yangfan.labor.service.student.impl;

import org.springframework.stereotype.Service;

import com.yangfan.labor.service.student.TestService;

/**
 * Created by leo01.zhu on 2018/9/30.
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String hello() {
        return "hello yangfan";
    }
}
