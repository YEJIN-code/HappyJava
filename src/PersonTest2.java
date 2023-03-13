public class PersonTest2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name="홍길동"; // 문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있음
        p1.address="일산";

        p2.name ="조조";
        p2.address="서울";

        System.out.println(Person.count); // static 필드(=클래스 변수) count는 인스턴스 이름이 아니라 클래스 이름으로 사용하는 게 좋음

        System.out.println(p1.name);
        System.out.println(p2.name);

        System.out.println(p1.count);
        System.out.println(p2.count);
        p1.count++; // p1을 증가시킴
        System.out.println(p1.count); // p1이 증가됨
        System.out.println(p2.count); // p2도 증가됨
        // static한 필드는 정적 영역에 따로 저장됨. 인스턴스 별로 가지는 값이 아님.

        p2.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);

        System.out.println(Person.count);
    }
}
