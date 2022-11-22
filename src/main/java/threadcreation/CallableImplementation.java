package threadcreation;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableImplementation implements Callable<Long> {
    @Override
    public Long call() throws Exception {
        Long next = (new Random()).longs(System.currentTimeMillis()).iterator().next();
        return next;
    }
}
