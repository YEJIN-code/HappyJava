package com.example;

/*
* 1. 1~45까지 적힌 공을 기계에 넣는다
* 2. 기계에 있는 공을 섞는다
* 3. 섞인 공 중 6개를 꺼낸다.
* */

public interface LottoMachine { // 인터페이스의 모든 필드는 public static함
    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;

    public void setBalls(Ball[] balls); // 볼 45개를 받음
    public void mix(); // 볼을 섞음
    public Ball[] getBalls(); // 6개의 볼을 반환
}
