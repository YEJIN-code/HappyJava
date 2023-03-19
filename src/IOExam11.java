import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class IOExam11 {
    // 이름, 국어, 영어, 수학, 총점, 평균 점수를 score.dat 파일에 저장

    public static void main(String[] args) throws Exception {
        String name = "kim";
        int kor = 90;
        int eng = 50;
        int math = 70;
        double total = kor+eng+math;
        double avg = total/3.0;

        // 다양한 타입을 저장할 때 사용하는 DataOutputStream
        DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\user\\test\\score.dat"));
        out.writeUTF(name); // char 저장
        out.writeInt(kor); // int 저장
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);
        out.close();
    }
}
