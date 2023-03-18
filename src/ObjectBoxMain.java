public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox(); // 오브젝트 타입으로 넣었다면
        box.set("kim");
        String str = (String) box.get(); // 원래 타입으로 바꿔줌
        System.out.println(str.toUpperCase()); // 대문자로

        box.set(new Integer(5));
        Integer i = (Integer) box.get();
        System.out.println(i.intValue());
    }
}
