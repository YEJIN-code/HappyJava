import java.io.FileReader;
import java.io.Reader;

public class HelloIO04 {
    public static void main(String[] args) throws Exception{
        Reader in = new FileReader("C:\\Users\\user\\test\\test.txt");
//        int ch1 = in.read();
//        System.out.println((char)ch1);
//        int ch2 = in.read();
//        System.out.println((char)ch2);

        int ch = -1;
        while ((ch = in.read()) !=-1 ){
            System.out.println((char)ch); // 문자로 형변환해줘야 문자로 출력
        }

        in.close();
    }
}
