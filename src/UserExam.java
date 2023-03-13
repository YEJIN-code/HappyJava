public class UserExam {
    public static void main(String[] args) {
        User user = new User("김성박", "123@123.com");

        System.out.println(user);

        User user2 = new User("홍길동", "456.456.com", "1234");
        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());
        System.out.println(user2);
    }
}
