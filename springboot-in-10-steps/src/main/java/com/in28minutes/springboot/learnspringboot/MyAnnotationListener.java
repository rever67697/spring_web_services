package com.in28minutes.springboot.learnspringboot;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyAnnotationListener {

    @EventListener(MyTestEvent.class)
    public void MyTestEvent(MyTestEvent event) {
        System.out.println("listener 1:" + event.getMsg());
    }
}
