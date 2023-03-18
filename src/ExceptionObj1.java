public class ExceptionObj1 {
    /**
     * i를 k로 나눈 나머지를 반환한다.
     *
     * @param i
     * @param k
     * @return the int
     * @throws ArithmeticException
     */
    public int divide(int i, int k) throws ArithmeticException { // throws ArithmeticException: 예외 떠넘기기
        int value = 0;
        value = i / k;

        // 예외처리
//        try {
//            value=i/k;
//        } catch (ArithmeticException ex){
//            System.out.println("0으로 나눌 수 없음");
//            System.out.println(ex.toString());
//        }
        return value;
    }
}
