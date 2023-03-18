import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet eset = EnumSet.allOf(Day.class); // Day가 가진 모든 class를 allOf를 통해 eset에 넣음

        Iterator<Day> dayIter = eset.iterator();

        while (dayIter.hasNext()){
            Day day = dayIter.next();
            System.out.println(day);
        }
        System.out.println("----------------------------------------");

        EnumSet eset2 = EnumSet.range(Day.MONDAY, Day.WEDNESDAY);
        Iterator<Day> dayIter2 = eset2.iterator();

        while (dayIter2.hasNext()){
            Day day = dayIter2.next();
            System.out.println(day);
        }
    }
}
