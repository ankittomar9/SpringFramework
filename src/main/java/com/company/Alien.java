package com.company;

public class Alien {

        private int age;
     //   private Laptop lap =new Laptop(); // As we are using spring we want to inject
  //  private Laptop lap; //Injecting using bean reference in property
    private Computer com;

    public Alien(){
      System.out.println("Alien Constructor called Object created"); //now it won't called the default constructor
    }


//    public Alien(int age , Laptop lap){
//        System.out.println("Alien Parameterized Constructor called ");
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void setAge(int age) {
  //      System.out.println("Setter called object with age: Setter Injection  " );
        this.age = age;
    }

    public void code(){

        System.out.println(" Spring Coding");
        com.compile();
    }
}
