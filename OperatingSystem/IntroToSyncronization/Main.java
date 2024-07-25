package OperatingSystem.IntroToSyncronization;

class HelloWorldthread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running"+Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(Thread.currentThread().getName()); 
        // Mainthread t1 = new Mainthread();
        HelloWorldthread t1 = new HelloWorldthread();
        t1.start();
    }
}



