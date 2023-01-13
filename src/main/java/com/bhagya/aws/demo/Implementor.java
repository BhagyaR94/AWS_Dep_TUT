package com.bhagya.aws.demo;

public class Implementor implements FuncIntTest{
    @Override
    public String method1() {
        return null;
    }

    @Override
    public void method2() {

    }

    @Override
    public String method3() {

        return FuncIntTest.super.method3();

    }

}
