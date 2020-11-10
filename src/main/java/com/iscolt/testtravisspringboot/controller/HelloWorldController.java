package com.iscolt.testtravisspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xx
 * <p>
 * Description:
 * </p>
 *
 * @author: https://github.com/isColt
 * @date: 2020/11/10
 * @see: com.iscolt.testtravisspringboot.controller
 * @version: v1.0.0
 */
@RestController
public class HelloWorldController {
    @GetMapping(value = "")
    public String hello() {
        return "Hello World! Travis!";
    }
}
