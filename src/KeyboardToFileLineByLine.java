// 키보드로부터 한 줄씩 입력받아 파일에 출력하는 프로그램

import java.io.*;

public class KeyboardToFileLineByLine {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/Users/user/test/test2.txt"); // 입력받은 텍스트를 저장할 파일 생성
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file)); // 파일에 쓸 스트림

        // BufferedReader의 readLine()을 이용해야 한 줄씩 입력받을 수 있는데, BufferedReader은 장식
        // 키보드를 나타내는 것은 System.in - 주인공 - InputStream
        // System.in을 받아들이는 InputStreamReader 객체를 만들고 Reader을 받아들이는 BufferedReader로 넘겨주는 순서
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드에서 입력받을 스트림

        String line = null; // 입력받은 텍스트
        while ( ( line= br.readLine()) != null) { // 한줄 입력 받았을 때 null이 아닐때까지
            bufferedWriter.write(line); // 파일에 저장
            bufferedWriter.newLine(); // 줄바꿈
            System.out.println(line+" <- 저장했습니다."); // 읽었는지 확인용
        }
        bufferedWriter.close(); // 끝나면 닫아줌
    }
}
