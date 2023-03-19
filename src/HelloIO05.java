import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HelloIO05 {
    public static void main(String[] args) throws Exception{
        PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\user\\test\\test.txt")));
        out.println("hello");
        out.println("world");
        out.close();
    }
}
