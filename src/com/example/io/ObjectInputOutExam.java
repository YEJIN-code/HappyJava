package com.example.io;

import java.io.*;
import java.util.ArrayList;

public class ObjectInputOutExam {
    public static void main(String[] args) throws Exception{
        User user1 = new User("123@123.com", "홍길동", 1992);
        User user2 = new User("456@123.com", "고길동", 1995);
        User user3 = new User("789@123.com", "둘리", 1991);
        // /tmp/user.dat 에 정보를 저장하고 싶음

        ArrayList<User> list = new ArrayList<>(); // 정보를 리스트로 한번에 저장
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ArrayList<User> list2 = copy(list);

        for (int i=0;i< list2.size();i++){
            System.out.println(list2.get(i));
        }
    }

    // 기존 리스트를 Arraylist로 복사(깊은 복사: 같은 내용의 새로운 객체를 생성해서 복사본이 원본의 변화에 영향을 받지 않음)하는 메소드
    private static ArrayList<User> copy(ArrayList<User> list) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);

        out.writeObject(list); // 직렬화해줘

        out.close();
        bout.close();

        byte[] array = bout.toByteArray(); // 리스트가 직렬화가 돼서 바이트 배열로

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(array));
        ArrayList<User> list2 = (ArrayList) in.readObject();
        in.close();
        return list2;
    }
}
