public class VendingMachine {
    // field: 가지는 것들
    // 생성자
    // method: 기능

    public String pushProductButton(int menuID){
        System.out.println(menuID + "를 전달받았습니다.");
        return "콜라";
    }

    // static은 인스턴스를 생성해야 사용 가능
    public static void printVersion() {
        System.out.println("v1.0");
    }
}
