package com.jungen.study.designpattern.creational.simplefactory.code;

import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void testSimpleFactoryByName() {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideoByName("Java");
        if (video == null) {
            return;
        }
        video.produce();
    }

    @Test
    public void testSimpleFactoryByClass() throws Exception {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideoByClass(PythonVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }

    @Test
    public void testSimpleFactoryByClassName() throws Exception {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideoByClassName("com.jungen.study.designpattern.creational.simplefactory.code.JavaVideo");
        if (video == null) {
            return;
        }
        video.produce();
    }
}
