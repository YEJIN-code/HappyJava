public class SportsCar extends Car2{
    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("사륜구동");
    }
}
