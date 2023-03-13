package com.example;

import com.example.Ball;
import com.example.LottoMachine;

public class LottoMachineImpl implements LottoMachine {
    private Ball[] balls;

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    @Override
    public void mix() {
        for (int i=0; i<10000; i++) {
            int x1 = (int)(Math.random()*45);
            int x2 = (int)(Math.random()*45);
            if (x1 != x2) {
                Ball tmp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }
    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[6];
        for(int i=0; i<6; i++) {
            result[i] = balls[i];
        }

        return new Ball[0];
    }
}
