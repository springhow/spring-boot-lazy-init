package com.springhow.examples.springbootlazyinit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootLazyInitApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpringBootLazyInitApplication.class)
                .lazyInitialization(true)
                .build()
                .run(args);
    }

}
