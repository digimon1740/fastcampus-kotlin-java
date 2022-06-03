package com.fastcampus.kotlinjava.jvmstatic;

public class JvmStaticExample {

    public static void main(String[] args) {

        String hello = HelloClass.hello();
        System.out.println(hello);

        String hi = HiObject.hi();
        System.out.println(hi);

    }
}
