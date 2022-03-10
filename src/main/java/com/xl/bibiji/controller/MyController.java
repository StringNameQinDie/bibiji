package com.xl.bibiji.controller;

import com.xl.selfspringbootautoconfiguer.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xyk
 */
@RestController
public class MyController {

    @Autowired
    MyService myService;

    @RequestMapping("/hello")
    public String test1(){
        return myService.talkService("heihei");
    }

}
