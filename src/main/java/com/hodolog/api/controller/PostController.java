package com.hodolog.api.controller;

import com.hodolog.api.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
public class PostController {

    //Http Method
    //Get, post, putpatch,delete, options, head, trace , connect
    @PostMapping("/posts")
    public String get(@ModelAttribute PostCreate params){
        log.info("params={}",params.toString());
//        System.out.println("titile={}, content={}");
        return "Hello world";
    }
}
