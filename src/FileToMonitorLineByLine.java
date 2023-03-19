// 텍스트 파일로부터 한 줄씩 입력받아서 화면에 출력하는 프로그팸

import java.io.*;


public class FileToMonitorLineByLine {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("C:/Users/user/test/test.txt"); // 파일 생성
            FileReader fileReader = new FileReader(file); // 입력 스트림 생성
            BufferedReader bufferedReader = new BufferedReader(fileReader); // 한줄씩 읽을 땐 버퍼를 사용하는 게 효율적이라고 하여 버퍼도 생성

            String str = ""; // 줄 단위로 읽어올 변수
            while ((str = bufferedReader.readLine()) != null) { // 값이 있으면 반복
                System.out.println(str); // 줄 단위로 출력
            }
            bufferedReader.close(); // 다 읽으면 파일 닫음

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
            // catch 부분은 아직 잘 모르겠다
        }
    }
}

