package com.xzfd.bms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.xzfd.bms.controller
 * @NAME: HelloController
 * @USER: zhangzuojun
 * @DATE: 2019/6/9
 * @TIME: 13:18
 * @PROJECT_NAME: bms
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
       return "hello,springboot!!!";
    }
}
