import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap emap = new EnumMap(Day.class); // EnumMap: Enum 타입을 키로 사용할 수 있도록 하는 클래스
        emap.put(Day.SUNDAY, "일요일 최고"); // 키, 값 설정
        emap.put(Day.FRIDAY, "불금");
        emap.put(Day.MONDAY, "월요병");

        System.out.println(emap.get(Day.SUNDAY));
    }
}
