public class GenericBox<T> {
    private T t;

    public void add(T obj){
        this.t=obj;
    }

    public T get(){
        return this.t;
    }
}
