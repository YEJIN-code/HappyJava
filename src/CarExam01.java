// 메소드가 오버라이딩되면 무조건 오버라이딩된 메소드가 실행된다

public class CarExam01 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.run(); // 버스는 후륜구동으로 달린다.
        b1.안내방송();

        Car c1 = new Bus(); // 버스는 자동차다
        c1.run(); // c1 자동차는 달린다. 여기서 말하는 자동차는 Bus()이므로 후륜구동으로 달린다.
//        c1.안내방송(); // 오류
        Bus b2 = (Bus)c1; // c1이 참조하는 Bus 인스턴스를 원래 Bus의 타입으로 참조해서 사용하겠다고 선언
        b2.안내방송(); // 정상

        Car c2 = new SuperCar();
        c2.run(); // 사륜구동으로 달린다.
    }
}
