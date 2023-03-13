public class Exam01 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("-----------------------------");

        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("-----------------------------");

        // 메소드가 오버라이딩되면 무조건 자식의 것이 실행된다
        Parent p2 = new Child(); // Child는 Parent의 자식이므로 오류 ㄴㄴ
        System.out.println(p2.i); // 필드는 부모를 따라감
        p2.printII();
        p2.printI();
    }
}
