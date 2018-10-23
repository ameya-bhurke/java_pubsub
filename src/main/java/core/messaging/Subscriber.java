package core.messaging;

public interface Subscriber<E> {

    void onPublish(E msg);
}
