package com.company;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    public  Desktop(){
        System.out.println("Desktop Constructor is called Object Created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling Using Desktop");
    }
}
