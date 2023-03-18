public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>(); // 정해져있지 않던 타입 T를 String으로 설정
        genericBox.add("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());
    }
}
