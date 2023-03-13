public class Person {
    String name; // 인스턴스 필드 (static이 아닌 것)
    String address;
    boolean isVip;
    static int count; // 클래스 필드 (static인 것)
    static { // 클래스 필드는 static 블록에서 초기화 가능
        count = 100;
    }

    public void printName() { // 인스턴스 메소드
        System.out.println("내 이름은 " + name);
    }

    public static void printCount() { // 클래스 메소드
//        System.out.println(name); // static한 메소드에서는 인스턴스 필드나 인스턴스 메소드 사용 불가
//                                      인스턴스 필드나 메소드는 인스턴스가 생성되어야 사용할 수 있지만,
//                                      클래스 필드나 메소드는 인스턴스가 없어도 사용할 수 있기 때문
        System.out.println("count: " + count);
    }
}
