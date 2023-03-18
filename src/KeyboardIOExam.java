import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception{
        // 키보드로부터 한 줄씩 입력 받고 화면에 한 줄씩 출력
        // 키보드: System.in (InputStream 주인공)
        // 화면: System.out (PrintStream 주인공)
        // 키보드로부터 문자를 입력: char 단위 입출력
        // char 단위 입출력 class: Reader, Writer
        // 한줄읽기: BufferedReader 클래스의 readline 메소드 (장식)
        // 한줄쓰기: PrintStream, PrintWriter

        // CharReader: 문자로부터 읽어서 안 됨
        // FilterReader: 장식이라 안 됨. Reader를 넣어줘야 함
        // InputStreamReader(InputStream in): 장식인데 InputStream을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ( ( line= br.readLine()) != null) { // 한줄 입력 받았을 때 null이 아닐때까지
            System.out.println("읽은 값: "+ line);
        }
    }
}
