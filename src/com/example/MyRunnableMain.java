package com.example;

public class MyRunnableMain {

//    람다 인터페이스
//    () ->{
//        System.out.println("Hello");
//    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("myrunnerble run");
            }
        };
        r.run();
    }

}
