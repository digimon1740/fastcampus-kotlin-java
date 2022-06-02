package com.fastcampus.kotlinjava.exception;

import java.io.IOException;

public class JavaThrow {

    public void throwIOException() throws IOException {
        throw new IOException("체크드 익셉션인 IOException 발생");
    }

    public static void main(String[] args) {

        KotlinThrow kotlinThrow = new KotlinThrow();
        try {
            kotlinThrow.throwIOException();
        } catch(IOException e) {

        }

    }
}
