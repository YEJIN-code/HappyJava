package com.example.fw;

/*
Controller의 종류가 어려 개
초기화- 같음
실행 - 다름?
마무리 - 같음
* */

public abstract class Controller {
    // protected: 같은 패키지이거나 상속받았을 때 접근 가능
    protected final void init(){ // final: 오버라이딩 불가
        System.out.println("초기화");
    }

    protected final void close() {
        System.out.println("마무리 코드");
    }
    protected abstract void run();

    // 내가 가진 메소드를 어떤 순서를 가지고 호출한다
    // => 템플릿 메소드. 사용자는 각각의 메소드를 호출하는 게 아니라, 템플릿 메소드 한 번으로 모두 호출.
    public void execute(){
        this.init(); // 초기화
        this.run(); // 실행
        this.close(); // 마무리
    }
}
