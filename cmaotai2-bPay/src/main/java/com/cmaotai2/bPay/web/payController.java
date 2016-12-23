package com.cmaotai2.bPay.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dsj on 2016/12/21.
 */
@RestController
public class payController
{
    @RequestMapping("/")
    public String greeting() {
        return "这是第一个spring boot 例子.......!";
    }




}
