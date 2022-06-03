package com.fastcampus.kotlinjava.extensions;

public class ExtensionExample {

    public static void main(String[] args) {
        //"ABCD".first();

        MyExtensionsKt.first("ABCD");
        MyExtensionsKt.addFirstChar("ABCD", 'Z');

    }
}
