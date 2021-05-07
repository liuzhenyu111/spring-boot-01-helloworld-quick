package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuzhenyu
 * @create 2020/8/23-18:13
 */
@ResponseBody//这个类的所有方法返回数据，直接写给浏览器，如果是对象，转为json数据
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World quick";
    }


}
