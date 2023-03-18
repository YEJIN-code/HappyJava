import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        Collections.sort(list); // Collections에 유용한 메소드 있음!

        for(int i=0;i< list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
