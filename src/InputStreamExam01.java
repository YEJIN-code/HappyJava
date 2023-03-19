import java.io.IOException;
import java.io.InputStream;

// 1바이트: 0000 0000 ~ 1111 1111
// int는 4바이트

public class InputStreamExam01 {
    public static void main(String[] args) {
        InputStream in = null;
        try{
            int data = in.read(); // EOF를 -1로써 표현하기 위해 바이트 단위로 읽어들여도 인트로 반환함
        } catch (IOException e) {
            System.out.println("io 오류: "+e);
        } finally {
            try{
                in.close();
            } catch (Exception ex) {
                System.out.println("io 오류 2"+ex);
            }

        }
    }
}
