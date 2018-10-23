package core.messaging;

import java.util.ArrayList;
import java.util.List;

public class ParallelPublisher<E> implements Publisher<E>  {

    private final List<Subscriber<E>> subscribers;

    public ParallelPublisher() {
        subscribers = new ArrayList<Subscriber<E>>();
    }

    public void subscribe(Subscriber<E> sub) {
        subscribers.add(sub);
    }

    public void publish(final E event) {
        subscribers.parallelStream()
                .forEach(sub -> sub.onPublish(event));
    }
}
