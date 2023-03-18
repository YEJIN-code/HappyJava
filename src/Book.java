/**
 * @author YEJIN
 * @since 2023-03-18
 * @version 1.0.0
 * */

public class Book {
    private String title;
    private int price; // field price

    // 필드의 값을 수정하고 얻기 위한 setter, getter 프로퍼티를 만든다

    public int getPrice() {
        return this.price*2;
    }

    public void setPrice(int price) { // 지역변수 price
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
