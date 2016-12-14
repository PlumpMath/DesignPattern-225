package com.chen.thead;

import java.util.concurrent.*;

/**
 * Created by Chen on 2016/12/14.
 */
public class TheadPool {

    public static final void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i <= 10; i++) {
            FutureTask futureTask =  new FutureTask<String>(new Callable<String>() {
                public String call() throws Exception {
                    Thread.sleep(1000);
                    System.out.println("call handle");
                    return "handler ";
                }
            });
            service.submit(futureTask);
            System.out.println("futrueTask result = " + futureTask.get());
        }
    }
}
