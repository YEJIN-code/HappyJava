public class DaySwitchTest {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;

        switch (day) {
            case SUNDAY -> { // Enum타입인 경우 Day.SUNDAY가 아니라 그냥 SUNDAY로 받아옴
                System.out.println("일요일입니다");
                break;
            }
            case MONDAY -> {
                System.out.println("월요일입니다");
                break;
            }
            default -> System.out.println("그 외의 요일");
        }
    }
}
