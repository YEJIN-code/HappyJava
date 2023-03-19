import java.io.File;
import java.io.IOException;

public class TempFile {
    public static void main(String[] args) {
        try {
            File f = File.createTempFile("tmp_", ".dat"); // 임시파일 생성
            System.out.println(f.getAbsolutePath()); // 생성된 파일 경로 출력
            System.out.println("60초간 정지");
            try{
                Thread.sleep(60000);
            } catch (InterruptedException e1) {
                System.out.println(e1);
            }
            f.deleteOnExit(); // JVM 종료 시 자동으로 임시파일 삭제
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
