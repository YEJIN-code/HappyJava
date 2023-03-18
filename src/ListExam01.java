import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args) {
        // 자료구조객체들은 제네릭( 클래스 이름 옆 <> )을 사용하지 않으면 오브젝트 타입을 저장
        ArrayList list = new ArrayList();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = (String) list.get(0); // string으로 형변환
        String str2 = (String) list.get(1);
        String str3 = (String) list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
