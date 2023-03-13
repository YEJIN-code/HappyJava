public class CarExam02 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1); // println(Object x) - 오브젝트로 참조할 수 있는 것은 무엇이든 가능
        c1.printName();
        System.out.println("--------------------");

        Car c2 = new Car("메피");
        c2.printName();
    }
}

// 부모타입의 변수로 자식인스턴스를 참조할 수 있음
// 주상타입의 변수로 후손인스턴스를 참조할 수 있음
// Car c1 = new Bus();
// Car c2 = new 이층버스(); // 이층버스는 Car의 자손이다
// Object o1 = new Car();
// Object o2 = new Bus();
// Object p3 = new 이층버스();