import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloIO01 {
    public static void main(String[] args) throws Exception {
        OutputStream out = new FileOutputStream("C:/Users/user/test/test.txt");
        out.write(1); // 1 -> 0000 0000 0000 0000 0000 0000 0000 0001
        out.write(255);
        out.write(0);
        out.close();
    }
}
