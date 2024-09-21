package org.example.hostingdemo.controllers;

import org.example.hostingdemo.model.TestModel;
import org.example.hostingdemo.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public TestModel test() {
        return testService.getTestModel(new TestModel("name", "test@mail.com"));
    }
}
