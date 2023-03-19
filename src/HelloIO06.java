import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class HelloIO06 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\user\\test\\test.txt")));

        String line1 = null;
        while ((line1= bufferedReader.readLine()) != null) {
            System.out.println(line1);
        }

        bufferedReader.close();
    }
}
