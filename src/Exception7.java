public class Exception7 {
    public static void main(String[] args) {
        try {
            ExceptionObj7 exobj = new ExceptionObj7();
            int value = exobj.divide(10, 0);
            System.out.println(value);
        }catch (MyException ex){
            System.out.println("사용자 정의 Exception 발생");
        }
    }
}

class ExceptionObj7{
    public int divide(int i, int k) throws MyException {
        int value =0;
        try {
            value=i/k;
        } catch (ArithmeticException ex){ // 자동으로 발생한 Exception을 받아옴
            throw new MyException("0으로 나눌 수 없음"); // 사용자 정의 Exception로 바꿈
        }
        return value;
    }
}