public class NumberExam01 {
    public static void main(String[] args) {
        int maxINT = Integer.MAX_VALUE;
        int minINT = Integer.MIN_VALUE;
        double maxDOUBLE = Double.MAX_VALUE;

        System.out.println(maxINT);
        System.out.println(minINT);
        System.out.println(maxDOUBLE);

        double d1 = 50;
        double d2 = 50l;

        System.out.println(d1);
        System.out.println(d2);

        // 더블은 인트에 넣을 수 없음

        int i1 = (int)50.5; // 강제 형변환
        System.out.println(i1);

        char c='a';
        while(c<='z'){
            System.out.println(c);
            c++;
        }
    }
}
