package com.example.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExam {
    public static void main(String[] args) throws Exception{
        User user = new User("123@123.com", "홍길동", 1992);
        // /tmp/user.dat 에 정보를 저장하고 싶음

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\user\\test\\user.dat"));
        out.writeObject(user);
        out.close();
    }
}
