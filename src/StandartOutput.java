public class StandartOutput {
//    오버로딩: 같은 메소드 이름이어도 매개변수가 다름

    public void println(boolean b){
        System.out.println(b);
    }

    public void println(int i){
        System.out.println(i);
    }

    public void println(double d){
        System.out.println(d);
    }

    public void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args) { // 실행 시 클래스 메소드(static 메소드)는 메모리에 올라가고, 인스턴스는 ㄴ
        StandartOutput output = new StandartOutput();
        output.println(100);
        output.println("hello");
        output.println(10.5);
        output.println(false);
    }
}
