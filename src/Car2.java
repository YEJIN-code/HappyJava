public abstract class Car2 { // abstract: 추상 클래스
    public Car2(String name){
        super(); // 자동으로 들어감
        System.out.println("Car() 생성자 호출");
    }

    // 추상메소드. Car2를 만든 사람은 run() 메소드가 필요하다 생각
    // run()은 자동차마다 다르게 구현할 것 같음
    public abstract void run();
}
