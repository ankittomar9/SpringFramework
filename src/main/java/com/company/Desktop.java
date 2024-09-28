package com.company;

public class Desktop implements Computer{
    public  Desktop(){
        System.out.println("Desktop Constructor is called Object Created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling Using Desktop");
    }
}
