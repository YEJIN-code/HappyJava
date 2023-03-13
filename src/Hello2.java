public class Hello2 {
    static int i;
    static {
        i=500;
        System.out.println("static block"); // 원래는 static field를 초기화
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

// 컴파일 후 실행 > JVM이 CLASSPATH에서 Hello2 클래스 탐색
// main 메소드가 실행되기 전에 static 블록 안의 코드가 먼저 실행됨