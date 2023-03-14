package com.example;

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car() {
            @Override
            public void a() {
                System.out.println("이름 없는 객체 a()의 메소드 오버라이딩");
            }
        };

        c1.a();
    }
}
