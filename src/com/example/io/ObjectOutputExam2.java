package com.example.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputExam2 {
    public static void main(String[] args) throws Exception{
        User user1 = new User("123@123.com", "홍길동", 1992);
        User user2 = new User("456@123.com", "고길동", 1995);
        User user3 = new User("789@123.com", "둘리", 1991);
        // /tmp/user.dat 에 정보를 저장하고 싶음

        ArrayList<User> list = new ArrayList<>(); // 정보를 리스트로 한번에 저장
        list.add(user1);
        list.add(user2);
        list.add(user3);


        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\user\\test\\userlist.dat"));
        out.writeObject(list);
        out.close();
    }
}
