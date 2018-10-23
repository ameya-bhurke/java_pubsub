package core.messaging.test;

import core.messaging.ParallelPublisher;
import core.messaging.Subscriber;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestParallelPublisher {

    public static final String PUB_SUB_TEST_IP = "TEST";

    @Test
    public void testStringPubSub() {
        final List<String> op = new ArrayList<>();
        ParallelPublisher<String> publisher = new ParallelPublisher<>();
        publisher.subscribe(s -> op.add(s));
        publisher.publish(PUB_SUB_TEST_IP);
        Assert.assertEquals(op.size(), 1);
        Assert.assertEquals(op.get(0), PUB_SUB_TEST_IP);
    }
}
