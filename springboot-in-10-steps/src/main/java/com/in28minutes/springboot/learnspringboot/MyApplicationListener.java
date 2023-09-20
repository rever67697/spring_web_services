package com.in28minutes.springboot.learnspringboot;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// @Component
public class MyApplicationListener implements ApplicationListener<MyTestEvent> {

    @Override
    public void onApplicationEvent(MyTestEvent event) {
        System.out.println("listener 2：" + event.getMsg().toString());
    }
}
