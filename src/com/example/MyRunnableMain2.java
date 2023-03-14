package com.example;

public class MyRunnableMain2 {
    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        }; // 따로 만드는 것도 가능하고

        RunnableExcute runnableExcute = new RunnableExcute();
        System.out.println("--------------");

//        runnableExcute.excute(new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        }); // excute()에 바로 넣는 것도 가능

        runnableExcute.excute(() ->{
                    System.out.println("Hello");
                }
        ); // 간략하게 넣기도 가능 (람다 인터페이스)

        System.out.println("--------------");
    }

}
