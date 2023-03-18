import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // 제네릭 사용
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = list.get(0); // 형변환 ㄴㄴ
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
