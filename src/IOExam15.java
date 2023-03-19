import java.io.StringWriter;

public class IOExam15 {
    public static void main(String[] args) throws Exception{
        StringWriter out = new StringWriter();
        out.write("hello");
        out.close();

        String str = out.toString();
        System.out.println(str);

    }
}
