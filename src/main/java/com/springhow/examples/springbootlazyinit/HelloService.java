package com.springhow.examples.springbootlazyinit;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloService() {
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException ignored) {
        }
    }

    public String hello() {
        return "Hello There...!";
    }
}
