package com.flh.sphello;

public class HelloImpl3 implements HelloApi {
    private String message;
    private int index;

    @java.beans.ConstructorProperties({"a","b"})
    public HelloImpl3(String message, int index){
        this.message=message;
        this.index=index;
    }

    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
