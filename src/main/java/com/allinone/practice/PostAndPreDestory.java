package com.allinone.practice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PostAndPreDestory {

    @PostConstruct
    public void customInit() {
        System.out.println("Method customInit() invoked...");
    }
    @PreDestroy
    public void customDestroy() {
        System.out.println("Method customDestroy() invoked...");
    }
    public static void main(String[] args) {
        PostAndPreDestory postAndPreDestory = new PostAndPreDestory();
        postAndPreDestory.customInit();
        postAndPreDestory.customDestroy();
    }
}
