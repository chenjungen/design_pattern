package com.jungen.study.designpattern.creational.simplefactory.code;

public class JavaVideo implements Video {
    @Override
    public void produce() {
        System.out.println("java course");
    }
}
