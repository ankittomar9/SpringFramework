package com.company;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Constructor Object Created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling use Laptop");
    }
}
