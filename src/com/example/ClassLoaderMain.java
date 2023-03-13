package com.example;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception{
//        Bus b1 = new Bus();
//        b1.a();

        // ClassName에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고
        // 그 정보를 clazz가 참조하도록 함
        String className = "com.example.Bus";
        Class clazz = Class.forName(className);

//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for (Method m : declaredMethods) {
//            System.out.println(m.getName());
//        }

        Object o = clazz.newInstance();
        Car b = (Car) o;
        b.a();
    }
}
