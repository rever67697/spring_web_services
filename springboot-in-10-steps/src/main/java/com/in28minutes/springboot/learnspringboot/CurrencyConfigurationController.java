package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @Autowired
    private MyTestEventPubLisher publisher;

    @GetMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return configuration;
    }

    @GetMapping(value = "/test/testPublishEvent1")
    public void testPublishEvent() {
        Course course = new Course(1, "测试发布事件1", "测试发布事件1");
        publisher.pushListener(course);
    }
}
