package com.jungen.study.designpattern.creational.simplefactory.code;

import org.springframework.util.StringUtils;

public class VideoFactory {

    public Video getVideoByName(String videoName) {
        if (StringUtils.isEmpty(videoName)) {
            return null;
        }
        if ("Java".equals(videoName)) {
            return new JavaVideo();
        } else if (("Python").equals(videoName)) {
            return new PythonVideo();
        } else {
            return null;
        }
    }

    public Video getVideoByClass(Class videoClazz) throws Exception {
        if (videoClazz == null) {
            return null;
        }
        if (videoClazz == JavaVideo.class) {
            return JavaVideo.class.newInstance();
        } else if (videoClazz == PythonVideo.class) {
            return PythonVideo.class.newInstance();
        } else {
            return null;
        }
    }

    public Video getVideoByClassName(String videoClazzName) throws Exception {
        if (videoClazzName == null) {
            return null;
        }
        Class<?> videoClazz = Class.forName(videoClazzName);
        if (videoClazz == JavaVideo.class) {
            return JavaVideo.class.newInstance();
        } else if (videoClazz == PythonVideo.class) {
            return PythonVideo.class.newInstance();
        } else {
            return null;
        }
    }

}
