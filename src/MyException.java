public class MyException extends RuntimeException{
    // 오류 메시지나, 발생한 Exception을 감싼 결과로 내가 만든 Exception을 사용하고 싶을 때


    public MyException(String message) {
        super(message); // 부모에 전달함
    }

    public MyException(Exception cause) {
        super(cause);
    }
}
