package threadcreation;

import org.junit.jupiter.api.Test;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableImplementationTest extends CallableImplementation {

    @Test
    public void test() {
        FutureTask<Long> futureTask_1 = new FutureTask<>(new CallableImplementation());
        Thread thread_1 = new Thread(futureTask_1, "thread_1");

        FutureTask<Long> futureTask_2 = new FutureTask<>(new CallableImplementation());
        Thread thread_2 = new Thread(futureTask_2, "thread_2");

        thread_1.start();
        thread_2.start();
        try {
            System.out.println(thread_1.getName() + ":" + futureTask_1.get());
            System.out.println(thread_2.getName() + ":" + futureTask_2.get());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }


}
