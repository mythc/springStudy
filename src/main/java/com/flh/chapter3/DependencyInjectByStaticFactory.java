package com.flh.chapter3;

import com.flh.sphello.HelloApi;
import com.flh.sphello.HelloImpl3;

public class DependencyInjectByStaticFactory {
    public static HelloApi newInstance(String message, int index){
        return new HelloImpl3(message, index);
    }
}
