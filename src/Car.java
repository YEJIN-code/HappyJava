public class Car {
    private String name;

    public Car() { // 생성자
        System.out.println("자동차가 한 대 생성됩니다.");
    }

    public Car(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("자동차 이름: "+name);
    }

    public void run(){
        System.out.println("전륜구동으로 달리다.");
    }

    public String toString() {
        return "자동차!";
    }
}
