package com.company;

public class Alien {

        private int age;
     //   private Laptop lap =new Laptop(); // As we are using spring we want to inject
    private Laptop lap; //Injecting using bean reference in property

    public Alien(){
        System.out.println("Constructor called Object created");
    }

    public int getAge() {
        return age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void setAge(int age) {
        System.out.println("Setter called object with age: Setter Injection  " );
        this.age = age;
    }

    public void code(){

        System.out.println(" Spring Coding");
        lap.compile();
    }
}
