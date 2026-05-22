package com.anna.orderinventory.workflow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkflowController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }

}
