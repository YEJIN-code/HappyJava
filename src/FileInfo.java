import java.io.File;
import java.io.IOException;


public class FileInfo {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("사용법: java FileInfo 파일이름");
            System.exit(0);
        }

        File f = new File(args[0]); // 파일의 경로명
        if (f.exists()){ // 파일이 존재할 경우
            System.out.println("lenght: "+f.length());
            System.out.println("canRead: "+f.canRead());
            System.out.println("canWrite: "+f.canWrite());
            System.out.println("hetAbsolutePath: "+f.getAbsolutePath());

            System.out.println("getCanonicalPath: "+ f.getAbsolutePath()); // HappyJava에서 끝나고 .이 없다는데 나는 왜 있지
            System.out.println("getName: "+f.getName());
            System.out.println("getParent: "+f.getParent());
            System.out.println("getPath: "+f.getPath());
        }
        else {
            System.out.println("파일이 존재하지 않음");
        }
    }
}
