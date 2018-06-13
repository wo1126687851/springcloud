package com.example.demo.controller;

import org.springframework.stereotype.Component;

/**
 * Created by zsq on 2018/6/11.
 */
@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
