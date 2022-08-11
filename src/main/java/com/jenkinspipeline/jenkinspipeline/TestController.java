package com.jenkinspipeline.jenkinspipeline;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String Hello()
    {
        return "Web Server is running";
    }
}
