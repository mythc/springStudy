package com.flh.sphello;

public class HelloApiStaticFactory {
    public static HelloApi newInstance(String message){
        return new HelloImpl2(message);
    }
}
