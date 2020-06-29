package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import test.test1.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class DemoApplicationTests {


    @Test
    public void contextLoads() throws ExecutionException, InterruptedException {
        Thread thread = new Thread();
        FutureTask futureTask = new FutureTask<>(thread);
        new java.lang.Thread(futureTask).start();

        String items= (String)futureTask.get();
        System.out.println(items);
    }

}
