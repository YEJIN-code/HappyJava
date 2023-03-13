public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name="홍길동"; // 문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있음
        p1.address="일산";
        p1.isVip=true;

        p2.name ="조조";
        p2.address="서울";

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.address.length()); // 참조 시 인스턴스가 없으면 오류가 남
        System.out.println(p1.isVip);

        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);


    }
}
