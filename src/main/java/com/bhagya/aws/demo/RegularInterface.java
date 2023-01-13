package com.bhagya.aws.demo;

public interface RegularInterface {
    void method2();

    default String method3() {
        return "this will be default";
    }

    static String method4(){
        return "This will be static";
    }


}
