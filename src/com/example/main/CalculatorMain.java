package com.example.main;

import com.example.util.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int value = cal.plus(50, 100);
        System.out.println(value);

        // 같은 이름의 클래스를 사용할 땐, 하나는 import하고 다른 하나는 클래스 명 앞에 패키지명까지 붙여서 사용해야 함
        com.example.util2.Calculator cal2 = new com.example.util2.Calculator();
        int value2 = cal2.divide(100, 50);
        System.out.println(value2);
    }
}
