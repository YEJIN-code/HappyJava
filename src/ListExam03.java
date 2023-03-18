import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args) {

        // 최대한 앞에는 인스턴스 타입, 뒤에는 클래스 타입으로 하도록
        Collection<String> collection = new ArrayList<>(); // ArrayList()가 아니라 HashSet<>()을 사용하게 되면 순서 X
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

        Iterator<String> item = collection.iterator();
        while (item.hasNext()){
            String str = item.next();
            System.out.println(str);
        }
    }
}
