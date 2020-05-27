package com.qfjy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DemoController
 * @Author guoweixin
 * @Description TODO
 * @Date 2020/5/27 10:24
 * @Created by Administrator
 */
@RestController
public class DemoController {
    @RequestMapping("info")
    public String info(){
        return "Hello Git";
    }
    //修改
    //开发人员修改了一行代码
    //项目经理 添加了一行代码
    //项目经理：我又增加了1
}
