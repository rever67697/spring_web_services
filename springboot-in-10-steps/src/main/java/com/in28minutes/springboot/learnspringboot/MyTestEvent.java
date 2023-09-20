package com.in28minutes.springboot.learnspringboot;

import org.springframework.context.ApplicationEvent;


public class MyTestEvent extends ApplicationEvent {

    private Course msg;

    public void setMsg(Course msg) {
        this.msg = msg;
    }

    public MyTestEvent(Object source, Course msg) {
        super(source);
        this.msg = msg;
    }


    public Course getMsg() {
        return msg;
    }

}
