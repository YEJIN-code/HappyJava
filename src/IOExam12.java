import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOExam12 {
    public static void main(String[] args) throws Exception {
        // 이름, 국어, 영어, 수학, 총점, 평균 점수를 score.dat 파일에서 읽어들이기
        DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\user\\test\\score.dat")); // 읽어들이려면 DataOutputStream
        String name = in.readUTF();
        int kor = in.readInt();
        int eng = in.readInt();
        int math = in.readInt();
        double total = in.readDouble();
        double avg = in.readDouble();
        in.close();

        System.out.println(name);
        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        System.out.println(total);
        System.out.println(avg);
    }
}
