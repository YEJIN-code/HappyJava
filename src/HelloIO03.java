import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class HelloIO03 {
    public static void main(String[] args) throws Exception {
        Writer out =  new FileWriter("C:/Users/user/test/test.txt");
        out.write((int)'가');
        out.write((int)'!');
        out.close();
    }
}
