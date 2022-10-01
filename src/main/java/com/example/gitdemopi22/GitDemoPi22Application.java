package com.example.gitdemopi22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoPi22Application {

    public static void main(String[] args) {
        System.out.println("Evo aplikacije!");
        System.out.println("Novi commit!");
        SpringApplication.run(GitDemoPi22Application.class, args);
    }

}
