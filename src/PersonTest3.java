public class PersonTest3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name ="홍길동";

        p1.printName();
        Person.printCount(); // p1.printCount() 말고 클래스명.메소드명() 형태로 하기

        Person.count++;
        Person.printCount();
    }
}
