package core.messaging;

public interface Publisher<E> {

    void subscribe(Subscriber<E> sub);

    void publish(E event);
}
