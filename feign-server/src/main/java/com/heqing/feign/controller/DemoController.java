package com.heqing.feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heqing
 * @date 2021/7/16 16:34
 */
@RestController
@RequestMapping("/feign")
public class DemoController {

    @GetMapping("/server")
    public String server(@RequestParam String str){
        return "hello " + str;
    }
}
